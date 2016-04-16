package cn.net.idear.repository;

import cn.net.idear.models.CbDegrees;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by wangdongwei on 4/16/16.
 */
public interface DegreeRepository extends JpaRepository<CbDegrees, Long> {
    List<CbDegrees> findByObjectId(String objectId);
}
