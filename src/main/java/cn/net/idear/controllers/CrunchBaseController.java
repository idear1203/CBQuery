package cn.net.idear.controllers;

import com.oembedler.moon.graphql.engine.GraphQLSchemaHolder;
import com.oembedler.moon.graphql.engine.execute.GraphQLQueryExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Class UserController
 */
@Controller
@RequestMapping("/graphql")
public class CrunchBaseController {

  /**
   * Retrieve the id for the user with the passed email address.
   */
  @RequestMapping(value="")
  @ResponseBody
  public Object queryPeopleById(String query) {
    return GraphQLQueryExecutor
            .create(graphQLSchemaHolder)
            .query(query)
            .execute()
            .getData();
  }

  @Autowired
  GraphQLSchemaHolder graphQLSchemaHolder;
}
