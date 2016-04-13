package cn.net.idear.controllers;

import cn.net.idear.daos.PeopleDao;
import cn.net.idear.models.CbPeople;
import cn.net.idear.schema.PeopleSchema;
import graphql.GraphQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Class UserController
 */
@Controller
@RequestMapping("/graphql")
public class CbPeopleController {

  // ------------------------
  // PUBLIC METHODS
  // ------------------------

  /**
   * Retrieve the id for the user with the passed email address.
   */
  @RequestMapping(value="id/{idString}")
  @ResponseBody
  public CbPeople getById(@PathVariable String idString) {
    CbPeople person;
    try {
      long id = Long.parseLong(idString);
      person = peopleDao.getById(id);
    }
    catch (Exception ex) {
      return null;
    }
    return person;
  }


  /**
   * Retrieve the id for the user with the passed email address.
   */
  @RequestMapping(value="amount/{amount}")
  @ResponseBody
  public List<CbPeople> getPeopleGivenAmount(@PathVariable String amount) {
    List<CbPeople> people;
    try {
      int a = Integer.parseInt(amount);
      people = peopleDao.getPeopleByGivenAmount(a);
    }
    catch (Exception ex) {
      return null;
    }
    return people;
  }

  /**
   * Retrieve the id for the user with the passed email address.
   */
  @RequestMapping(value="")
  @ResponseBody
  public Object queryPeopleById(String query) {
    return new GraphQL(peopleSchema.peopleSchema).execute(query).getData();
  }

  // ------------------------
  // PRIVATE FIELDS
  // ------------------------
  
  // Wire the peopleDao used inside this controller.
  @Autowired
  private PeopleDao peopleDao;

  @Autowired
  private PeopleSchema peopleSchema;
} // class UserController
