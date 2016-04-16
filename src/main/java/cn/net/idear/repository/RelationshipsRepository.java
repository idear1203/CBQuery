package cn.net.idear.repository;

import cn.net.idear.models.CbRelationships;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by wangdongwei on 4/16/16.
 */
public interface RelationshipsRepository extends JpaRepository<CbRelationships, Long> {
    List<CbRelationships> findByRelationshipObjectId(String relationshipObjectId);
}
