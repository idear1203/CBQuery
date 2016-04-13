package cn.net.idear.configs;

import cn.net.idear.schema.PeopleSchema;
import com.oembedler.moon.graphql.GraphQLSchemaBeanFactory;
import com.oembedler.moon.graphql.SpringGraphQLSchemaBeanFactory;
import com.oembedler.moon.graphql.engine.GraphQLSchemaBuilder;
import com.oembedler.moon.graphql.engine.GraphQLSchemaConfig;
import com.oembedler.moon.graphql.engine.GraphQLSchemaHolder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wangdongwei on 4/14/16.
 */
@Configuration
@ComponentScan(basePackages = "cn.net.idear.schema")
public class SchemaConfig {

    // use as is
    @Bean
    public GraphQLSchemaBeanFactory graphQLSchemaBeanFactory() {
        return new SpringGraphQLSchemaBeanFactory();
    }

    // configuration can be customized depending on the case
    @Bean
    public GraphQLSchemaConfig graphQLSchemaConfig() {
        GraphQLSchemaConfig graphQLSchemaConfig = new GraphQLSchemaConfig();
        return graphQLSchemaConfig;
    }

    // use as is
    @Bean
    public GraphQLSchemaBuilder graphQLSchemaBuilder() {
        return new GraphQLSchemaBuilder(graphQLSchemaConfig(), graphQLSchemaBeanFactory());
    }

    // use as is
    @Bean
    public GraphQLSchemaHolder graphQLSchemaHolder() {
        return graphQLSchemaBuilder().buildSchema(PeopleSchema.class);
    }
}
