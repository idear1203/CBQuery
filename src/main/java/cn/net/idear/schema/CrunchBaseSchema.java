package cn.net.idear.schema;

import cn.net.idear.models.CbDegrees;
import cn.net.idear.models.CbPeople;
import cn.net.idear.repository.DegreeRepository;
import cn.net.idear.repository.PeopleRepository;
import com.oembedler.moon.graphql.engine.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by wangdongwei on 4/13/16.
 */
@GraphQLSchema
public class CrunchBaseSchema {

    @GraphQLSchemaQuery
    private QueryType queryType;

    @GraphQLObject
    public static class Person {

        private long id;

        private long objectId;

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
    }

    @GraphQLObject
    public static class FundRound{
        private String fundingRoundCode;
        private Date fundedAt;

        public String getFundingRoundCode() {
            return fundingRoundCode;
        }

        public void setFundingRoundCode(String fundingRoundCode) {
            this.fundingRoundCode = fundingRoundCode;
        }

        public Date getFundedAt() {
            return fundedAt;
        }

        public void setFundedAt(Date fundedAt) {
            this.fundedAt = fundedAt;
        }
    }

    @GraphQLObject
    public static class Corporation{
        private List<FundRound> fundRounds;
        private List<Person> staffs;

        public List<FundRound> getFundRounds() {
            return fundRounds;
        }

        public void setFundRounds(List<FundRound> fundRounds) {
            this.fundRounds = fundRounds;
        }

        public List<Person> getStaffs() {
            return staffs;
        }

        public void setStaffs(List<Person> staffs) {
            this.staffs = staffs;
        }
    }


    /**
     * type Query {
     *  person(id: String): People
     *  person(objectId: String): People
     * }
     */
    @GraphQLObject
    public static class QueryType {

        @Autowired
        private PeopleRepository peopleRepository;

        @Autowired
        private DegreeRepository degreeRepository;

        @GraphQLField
        public Person person(@GraphQLIn("id") String id,
                             @GraphQLIn(value = "objectId") String objectId) {
            try {
                CbPeople cbPerson = null;
                if (id != null)
                    cbPerson =  peopleRepository.getOne(Long.parseLong(id));
                else if (objectId != null)
                    cbPerson =  peopleRepository.findByObjectId(objectId);
                if (cbPerson != null){
                    objectId = cbPerson.getObjectId();
                    List<CbDegrees> degrees = degreeRepository.findByObjectId(objectId);
                    Person person = new Person();
                    person.setFirstName(cbPerson.getFirstName());
                    person.setLastName(cbPerson.getLastName());
                    person.setInstitution(degrees.stream().map(CbDegrees::getInstitution).collect(Collectors.toList()));
                    return person;
                }
            }catch (Exception e){
            }
            return null;
        }

    }
}
