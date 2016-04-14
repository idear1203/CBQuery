package cn.net.idear.daos;

import cn.net.idear.models.CbPeople;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PeopleDao {
  
  /**
   * Save the person in the database.
   */
  public void create(CbPeople person) {
    entityManager.persist(person);
    return;
  }
  
  /**
   * Delete the person from the database.
   */
  public void delete(CbPeople person) {
    if (entityManager.contains(person))
      entityManager.remove(person);
    else
      entityManager.remove(entityManager.merge(person));
    return;
  }
  
  /**
   * Return all the people stored in the database.
   */
  @SuppressWarnings("unchecked")
  public List<CbPeople> getAll() {
    return entityManager.createQuery("from CbPeople").getResultList();
  }

//  /**
//   * Return all the peoples stored in the database.
//   */
//  @SuppressWarnings("unchecked")
//  public List<CbPeople> getPeopleByLimit(int amount) {
//    return entityManager.createQuery("from CbPeople")
//            .setMaxResults(amount)
//            .getResultList();
//  }

  /**
   * Return the person having the passed object id.
   */
  public CbPeople getByObjectId(String objectId) {
    return (CbPeople) entityManager.createQuery(
            "from CbPeople where objectId = :objectId")
            .setParameter("objectId", objectId)
            .getSingleResult();
  }

  /**
   * Return the person having the passed id.
   */
  public CbPeople getById(long id) {
    return entityManager.find(CbPeople.class, id);
  }

  /**
   * Update the passed person in the database.
   */
  public void update(CbPeople people) {
    entityManager.merge(people);
  }

  // ------------------------
  // PRIVATE FIELDS
  // ------------------------
  
  // An EntityManager will be automatically injected from entityManagerFactory
  // setup on DatabaseConfig class.
  @PersistenceContext
  private EntityManager entityManager;

} // class CbPeopleDao
