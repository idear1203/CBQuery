package cn.net.idear.controllers;

import com.oembedler.moon.graphql.engine.GraphQLSchemaHolder;
import com.oembedler.moon.graphql.engine.execute.GraphQLQueryExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

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
  public Object queryPeopleById(@RequestParam Map<String,String> allRequestParams) {
    String queryKey = null;
    Map<String, Object> params = new HashMap<>(allRequestParams);
    for (String key : params.keySet()){
      if (key.equals("query")){
        queryKey = key;
        break;
      }
    }
    if (queryKey != null) {
      String query = (String) params.remove(queryKey);
      return GraphQLQueryExecutor
              .create(graphQLSchemaHolder)
              .query(query)
              .arguments(params)
              .execute()
              .getData();
    }
    return  null;
  }

  @Autowired
  GraphQLSchemaHolder graphQLSchemaHolder;
}
