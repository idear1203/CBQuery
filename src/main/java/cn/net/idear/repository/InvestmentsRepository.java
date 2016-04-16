package cn.net.idear.repository;

import cn.net.idear.models.CbInvestments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by wangdongwei on 4/17/16.
 */
public interface InvestmentsRepository extends JpaRepository<CbInvestments, Long> {
    List<CbInvestments> findByInvestorObjectId(String investorObjectId);
}
