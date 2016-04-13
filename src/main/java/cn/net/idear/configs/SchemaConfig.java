package cn.net.idear.configs;

import cn.net.idear.daos.PeopleDao;
import cn.net.idear.schema.PeopleSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wangdongwei on 4/14/16.
 */
@Configuration
public class SchemaConfig {
    @Autowired
    private PeopleDao peopleDao;

    @Bean
    public PeopleSchema getPeopleSchema(){
        return new PeopleSchema(peopleDao);
    }
}
