package cn.net.idear.controllers;

import cn.net.idear.models.CbPeople;
import cn.net.idear.models.User;
import cn.net.idear.daos.PeopleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Class UserController
 */
@Controller
public class CbPeopleController {

  // ------------------------
  // PUBLIC METHODS
  // ------------------------

  /**
   * Retrieve the id for the user with the passed email address.
   */
  @RequestMapping(value="/id")
  @ResponseBody
  public CbPeople getById(String idString) {
    CbPeople people;
    try {
      long id = Long.parseLong(idString);
      people = peopleDao.getById(id);
    }
    catch (Exception ex) {
      return null;
    }
    return people;
  }
  
  // ------------------------
  // PRIVATE FIELDS
  // ------------------------
  
  // Wire the UserDao used inside this controller.
  @Autowired
  private PeopleDao peopleDao;
  
} // class UserController
