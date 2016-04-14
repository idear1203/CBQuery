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

    @GraphQLObject
    public static class QueryType {

        @Autowired
        private PeopleDao peopleDao;


        /**
         * query personNameQuery {
         *     person(id: "1") {
         *       name
         *     }
         * }
         */
        @GraphQLField
        public CbPeople person(@GraphQLNonNull @GraphQLIn("id") String idStr) {
            CbPeople person;
            try {
                int id = Integer.parseInt(idStr);
                person = peopleDao.getById(id);
            }catch (Exception e){
                return null;
            }
            return person;
        }

        /**
         * select  institution ,count(institution) from (( cb_degrees d inner join cb_relationships r on d.object_id=r.person_object_id) inner join cb_funding_rounds f on r.relationship_object_id=f.object_id )where funding_round_code in ('c','d','e','f','g') or (funding_round_code = 'b' and is_last_round = '0') group by institution order by count(institution) desc limit 10;
         */
    }
}
