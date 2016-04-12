package cn.net.idear.daos;

import cn.net.idear.models.CbPeople;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 * This class is used to access data for the CbPeople entity.
 * Repository annotation allows the component scanning support to find and 
 * configure the DAO wihtout any XML configuration and also provide the Spring 
 * exceptiom translation.
 * Since we've setup setPackagesToScan and transaction manager on
 * DatabaseConfig, any bean method annotated with Transactional will cause
 * Spring to magically call begin() and commit() at the start/end of the
 * method. If exception occurs it will also call rollback().
 */
@Repository
@Transactional
public class PeopleDao {
  
  // ------------------------
  // PUBLIC METHODS
  // ------------------------
  
  /**
   * Save the people in the database.
   */
  public void create(CbPeople people) {
    entityManager.persist(people);
    return;
  }
  
  /**
   * Delete the people from the database.
   */
  public void delete(CbPeople people) {
    if (entityManager.contains(people))
      entityManager.remove(people);
    else
      entityManager.remove(entityManager.merge(people));
    return;
  }
  
  /**
   * Return all the peoples stored in the database.
   */
  @SuppressWarnings("unchecked")
  public List<CbPeople> getAll() {
    return entityManager.createQuery("from CbPeople").getResultList();
  }
  
  /**
   * Return the people having the passed id.
   */
  public CbPeople getById(long id) {
    return entityManager.find(CbPeople.class, id);
  }

  /**
   * Update the passed people in the database.
   */
  public void update(CbPeople people) {
    entityManager.merge(people);
    return;
  }

  // ------------------------
  // PRIVATE FIELDS
  // ------------------------
  
  // An EntityManager will be automatically injected from entityManagerFactory
  // setup on DatabaseConfig class.
  @PersistenceContext
  private EntityManager entityManager;
  
} // class CbPeopleDao
