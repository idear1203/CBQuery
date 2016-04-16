package cn.net.idear.repository;

import cn.net.idear.models.CbFundingRounds;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by wangdongwei on 4/16/16.
 */
public interface FundingRoundsRepository extends JpaRepository<CbFundingRounds, Long>{
    List<CbFundingRounds> findByObjectId(String objectId);

    List<CbFundingRounds> findByFundingRoundCodeIn(List<String> fundingRoundList);
}
