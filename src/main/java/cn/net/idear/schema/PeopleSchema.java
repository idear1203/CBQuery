package cn.net.idear.schema;

import cn.net.idear.daos.PeopleDao;
import cn.net.idear.models.CbPeople;
import graphql.schema.*;

import static graphql.Scalars.GraphQLString;
import static graphql.schema.GraphQLArgument.newArgument;
import static graphql.schema.GraphQLFieldDefinition.newFieldDefinition;
import static graphql.schema.GraphQLObjectType.newObject;

/**
 * Created by wangdongwei on 4/13/16.
 */
public class PeopleSchema {

    private PeopleDao peopleDao;

    private DataFetcher personFetcher = new DataFetcher(){

        @Override
        public Object get(DataFetchingEnvironment environment) {
            CbPeople person;
            String idStr = environment.getArgument("id");
            try {
                int id = Integer.parseInt(idStr);
                person = peopleDao.getById(id);
            }catch (Exception e){
                e.printStackTrace();
                return null;
            }
            return person;
        }
    };

    public PeopleSchema(PeopleDao peopleDao){
        this.peopleDao = peopleDao;
    }

    public GraphQLObjectType personType = newObject()
            .name("Person")
            .description("A person in real world")
//            .withInterface(characterInterface)
            .field(newFieldDefinition()
                    .name("id")
                    .description("The id of the person.")
                    .type(new GraphQLNonNull(GraphQLString))
                    .build())
            .field(newFieldDefinition()
                    .name("objectId")
                    .description("The object id of the person.")
                    .type(new GraphQLNonNull(GraphQLString))
                    .build())
            .field(newFieldDefinition()
                    .name("firstName")
                    .description("The first name of the person.")
                    .type(GraphQLString)
                    .build())
            .field(newFieldDefinition()
                    .name("lastName")
                    .description("The last name of the person.")
                    .type(GraphQLString)
                    .build())
            .field(newFieldDefinition()
                    .name("birthplace")
                    .description("The birth place of the person.")
                    .type(GraphQLString)
                    .build())
            .build();

    public GraphQLObjectType queryType = newObject()
            .name("QueryType")
            .field(newFieldDefinition()
                    .name("person")
                    .type(personType)
                    .argument(newArgument()
                            .name("id")
                            .description("id of the person")
                            .type(new GraphQLNonNull(GraphQLString))
                            .build())
                    .dataFetcher(personFetcher)
                    .build())
            .build();


    public GraphQLSchema peopleSchema = GraphQLSchema.newSchema()
            .query(queryType)
            .build();
}
