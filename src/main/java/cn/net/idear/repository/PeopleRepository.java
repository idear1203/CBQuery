package cn.net.idear.repository;

import cn.net.idear.models.CbPeople;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by wangdongwei on 4/15/16.
 */
public interface PeopleRepository extends JpaRepository<CbPeople, Long> {

    List<CbPeople> findByFirstName(String firstName);

    CbPeople findByObjectId(String objectId);
}
