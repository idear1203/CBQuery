package cn.net.idear.schema;

import cn.net.idear.models.*;
import cn.net.idear.repository.*;
import com.oembedler.moon.graphql.engine.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.util.*;
import java.util.stream.Collectors;

import static cn.net.idear.util.Utility.monthsBetween;

/**
 * Created by wangdongwei on 4/13/16.
 */
@GraphQLSchema
public class CrunchBaseSchema {

    @GraphQLSchemaQuery
    private QueryType queryType;

    @GraphQLObject
    public static class Person {

        @GraphQLNonNull
        private long id;

        @GraphQLNonNull
        private String objectId;

        @GraphQLNonNull
        private String firstName;

        @GraphQLNonNull
        private String lastName;

        private List<String> institution;

        public List<String> getInstitution() {
            return institution;
        }

        public void setInstitution(List<String> institution) {
            this.institution = institution;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getObjectId() {
            return objectId;
        }

        public void setObjectId(String objectId) {
            this.objectId = objectId;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }


    }

    @GraphQLObject
    public static class Investor extends Person{

        @GraphQLField("company")
        List<InvestedCompany> investedCompanies;

        public List<InvestedCompany> getInvestedCompanies() {
            return investedCompanies;
        }

        public void setInvestedCompanies(List<InvestedCompany> investedCompanies) {
            this.investedCompanies = investedCompanies;
        }
    }

    @GraphQLObject
    public static class InvestedCompany {
        @GraphQLNonNull
        String id;

        private List<Person> staffs;

        private Map<String, List<Date>> roundInfo;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<Person> getStaffs() {
            return staffs;
        }

        public void setStaffs(List<Person> staffs) {
            this.staffs = staffs;
        }

        public Map<String, List<Date>> getRoundInfo() {
            return roundInfo;
        }

        public void setRoundInfo(Map<String, List<Date>> roundInfo) {
            this.roundInfo = roundInfo;
        }
    }

    @GraphQLObject
    public static class QueryType {

        @GraphQLIgnore
        @Autowired
        private PeopleRepository peopleRepository;

        @GraphQLIgnore
        @Autowired
        private DegreeRepository degreeRepository;

        @GraphQLIgnore
        @Autowired
        private FundingRoundsRepository fundingRoundsRepository;

        @GraphQLIgnore
        @Autowired
        private RelationshipsRepository relationshipsRepository;

        @GraphQLIgnore
        @Autowired
        private InvestmentsRepository investmentsRepository;

        @GraphQLIgnore
        private static final List<String> CONSIDERED_ROUND_CODES = Arrays.asList("seed", "angle", "a", "b", "c", "d", "e", "f", "g");

        @GraphQLField
        public Person person(@GraphQLIn("id") String id,
                             @GraphQLIn("objectId") String objectId) {
            try {
                CbPeople cbPerson = null;
                if (id != null)
                    cbPerson =  peopleRepository.getOne(Long.parseLong(id));
                else if (objectId != null)
                    cbPerson =  peopleRepository.findByObjectId(objectId);
                if (cbPerson != null) {
                    Person person = new Person();
                    build(person, cbPerson);
                    return person;
                }
            }catch (Exception e){
            }
            return null;
        }

        @GraphQLField
        public Investor investor(@GraphQLNonNull @GraphQLIn("id") String objectId,
                                 @GraphQLIn("staffInstitution") String institution){
            List<CbInvestments> investments = investmentsRepository.findByInvestorObjectId(objectId);
            List<InvestedCompany> fundedCompanies = investments
                    .stream()
                    .map(o->investedCompany(o.getFundedObjectId(), institution))
                    .collect(Collectors.toList());
            Investor investor = new Investor();
            build(investor, peopleRepository.findByObjectId(objectId));
            investor.setInvestedCompanies(fundedCompanies);
            return investor;
        }

        @GraphQLField
        public InvestedCompany investedCompany(@GraphQLNonNull @GraphQLIn("id") String id,
                                           @GraphQLIn("staffInstitution") String institution){
            List<CbRelationships> relationships = relationshipsRepository.findByRelationshipObjectId(id);
            Set<String> staffIds = relationships
                    .stream()
                    .filter(s-> institution == null
                            || isPersonHasBackground(s.getPersonObjectId(), institution))
                    .map(CbRelationships::getPersonObjectId)
                    .collect(Collectors.toSet());
            InvestedCompany company = new InvestedCompany();
            company.setId(id);
            List<Person> staffs = new ArrayList<>();
            for (String staffId : staffIds){
                Person person = new Person();
                build(person, peopleRepository.findByObjectId(staffId));
                staffs.add(person);
            }
            company.setStaffs(staffs);
            List<CbFundingRounds> fundingRounds = fundingRoundsRepository.findByObjectId(id);
            Map<String, List<Date>> map = new HashMap<>();
            for(CbFundingRounds fundingRound : fundingRounds){
                String code = fundingRound.getFundingRoundCode();
                if (code != null && fundingRound.getFundedAt() != null){
                    if(!map.containsKey(code))
                        map.put(code, new ArrayList<>());
                    map.get(code).add(fundingRound.getFundedAt());
                }
            }
            company.setRoundInfo(map);
            return company;
        }

        boolean isPersonHasBackground(String id, String institution){
            return degreeRepository.findByObjectId(id)
                    .stream()
                    .map(CbDegrees::getInstitution)
                    .collect(Collectors.toSet())
                    .contains(institution);
        }


        @GraphQLField
        public int averageDurationQuery(@GraphQLNonNull @GraphQLIn("startCode") String startCode,
                                  @GraphQLNonNull @GraphQLIn("endCode") String endCode){
            double rst = 0;
            int count = 0;
            List<InvestedCompany> companies = companiesRoundQuery(endCode);
            for (InvestedCompany company : companies){
                Map<String, List<Date>> map = company.getRoundInfo();
                List<Date> startDates = map.get(startCode);
                List<Date> endDates = map.get(endCode);
                if (startDates != null && endDates != null) {
                    for (Date startDate : startDates) {
                        for (Date endDate : endDates) {
                            if (startDate.getTime() <= endDate.getTime()) {
                                rst += monthsBetween(startDate, endDate);
                                count += 1;
                                break;
                            }
                        }
                    }
                }
            }
            //total 982 companies
            return (count == 0) ? 0 : (int)(rst / count);
        }

        @GraphQLField
        public List<InvestedCompany> companiesRoundQuery(@GraphQLNonNull @GraphQLIn("code") String code){
            int index = CONSIDERED_ROUND_CODES.indexOf(code);
            if (index == -1)
                return Collections.emptyList();
            List<String> higherCodes = CONSIDERED_ROUND_CODES.subList(index + 1, CONSIDERED_ROUND_CODES.size());
            List<CbFundingRounds> fundingRounds = fundingRoundsRepository.
                    findByFundingRoundCodeIn(higherCodes);
            Set<String> objectIds = fundingRounds
                    .stream()
                    .map(CbFundingRounds::getObjectId)
                    .collect(Collectors.toSet());
            return objectIds
                    .stream()
                    .map(objectId -> investedCompany(objectId, null))
                    .collect(Collectors.toList());
        }

        @GraphQLField
        public List<Investor> backgroundQuery(@GraphQLNonNull@GraphQLIn("investorIns") String investorIns,
                                              @GraphQLNonNull@GraphQLIn("investedIns") String investedIns){
            List<Investor> investors = investmentsRepository
                    .findAll()
                    .stream()
                    .filter(o->isPersonHasBackground(o.getInvestorObjectId(), investorIns))
                    .map(o->investor(o.getInvestorObjectId(), null))
                    .collect(Collectors.toList());
            List<Investor> rst = new ArrayList<>();
            for (Investor investor : investors) {
                List<InvestedCompany> companies = investor.getInvestedCompanies();
                for (InvestedCompany company : companies) {
                    List<Person> staffs = company.getStaffs();
                    int size = staffs.size();
                    if (size > 0) {
                        int count = 0;
                        for (Person staff : staffs) {
                            if (isPersonHasBackground(staff.getObjectId(), investedIns))
                                count++;
                        }
                        if (((double) count) / size >= 0.5) {
                            rst.add(investor);
//                            if (rst.size() > 10)
//                                return rst;
                        }
                    }
                }
            }
            return rst;
        }

        private void build(Person person, CbPeople cbPerson){
            if (cbPerson == null) return;
            String objectId = cbPerson.getObjectId();
            List<CbDegrees> degrees = degreeRepository.findByObjectId(objectId);
            person.setId(cbPerson.getId());
            person.setObjectId(objectId);
            person.setFirstName(cbPerson.getFirstName());
            person.setLastName(cbPerson.getLastName());
            person.setInstitution(degrees.stream().map(CbDegrees::getInstitution).collect(Collectors.toList()));
        }

    }
}
