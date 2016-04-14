package cn.net.idear.schema;

import cn.net.idear.daos.PeopleDao;
import cn.net.idear.models.CbPeople;
import com.oembedler.moon.graphql.engine.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wangdongwei on 4/13/16.
 */
@GraphQLSchema
public class CrunchBaseSchema {

    @GraphQLSchemaQuery
    private QueryType queryType;


    /**
     * type Query {
     *  person(id: String): People
     *  person(objectId: String): People
     * }
     */

    @GraphQLObject
    public static class QueryType {

        @Autowired
        private PeopleDao peopleDao;

        @GraphQLField
        public CbPeople person(@GraphQLIn("id") String id,
                             @GraphQLIn(value = "objectId") String objectId) {
            CbPeople person = null;
            try {
                if (id != null)
                    person = peopleDao.getById(Long.parseLong(id));
                else if (objectId != null)
                    person = peopleDao.getByObjectId(objectId);
            }catch (Exception e){
            }
            return person;
        }
    }
}
