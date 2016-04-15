package cn.net.idear.schema;

import cn.net.idear.daos.PeopleDao;
import cn.net.idear.models.CbPeople;
import cn.net.idear.repository.PeopleRepository;
import com.oembedler.moon.graphql.engine.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.util.Collections;
import java.util.List;

/**
 * Created by wangdongwei on 4/13/16.
 */
@GraphQLSchema
public class CrunchBaseSchema {

    @GraphQLSchemaQuery
    private QueryType queryType;

    @GraphQLObject
    public static class People{
        private List<String> schools;

        public List<String> getSchools() {
            return schools;
        }

        public void setSchools(List<String> schools) {
            this.schools = schools;
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
        private List<People> staffs;

        public List<FundRound> getFundRounds() {
            return fundRounds;
        }

        public void setFundRounds(List<FundRound> fundRounds) {
            this.fundRounds = fundRounds;
        }

        public List<People> getStaffs() {
            return staffs;
        }

        public void setStaffs(List<People> staffs) {
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

        @GraphQLField
        public CbPeople person(@GraphQLIn("id") String id,
                               @GraphQLIn(value = "objectId") String objectId) {
            try {
                if (id != null)
                    return peopleRepository.getOne(Long.parseLong(id));
                else if (objectId != null)
                    return peopleRepository.findByObjectId(objectId);
            }catch (Exception e){
            }
            return null;
        }

//        @Autowired
//        private PeopleDao peopleDao;
//
////        @GraphQLField
////        public Object corporation(@GraphQLIn("code") String roundCode){
////            List<Test> a = new ArrayList<Test>();
////            a.add(new Test(1));
////            for (CbFundingRounds fundingRounds : fundingRoundsDao.getAll()){
////            }
////        }
//
    }
}
