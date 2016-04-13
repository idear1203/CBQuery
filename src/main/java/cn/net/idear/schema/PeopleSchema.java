package cn.net.idear.schema;

import cn.net.idear.daos.PeopleDao;
import cn.net.idear.models.CbPeople;
import com.oembedler.moon.graphql.engine.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wangdongwei on 4/13/16.
 */
@GraphQLSchema
public class PeopleSchema {

    @GraphQLSchemaQuery
    private QueryType queryType;

    @GraphQLObject
    @GraphQLDescription("A person in real world.")
    public static class Person {
        @GraphQLIgnore
        private String id;

        @GraphQLIgnore
        private String firstName;

        @GraphQLIgnore
        private String lastName;

        @GraphQLNonNull
        @GraphQLField("id")
        @GraphQLDescription("The id of the human.")
        public String getId() {
            return null;
        }

        @GraphQLField("firstName")
        @GraphQLDescription("The first name of the human.")
        public String getFirstName() {
            return null;
        }

        @GraphQLField("lastName")
        @GraphQLDescription("The last name of the human.")
        public String getLastName() {
            return null;
        }
    }


    @GraphQLObject
    public static class QueryType {

        @Autowired
        private PeopleDao peopleDao;

        @GraphQLField
        public CbPeople person(@GraphQLNonNull @GraphQLIn("id") String idStr) {
            CbPeople person;
            try {
                int id = Integer.parseInt(idStr);
                person = peopleDao.getById(id);
            }catch (Exception e){
                e.printStackTrace();
                return null;
            }
            return person;
        }
    }
}
