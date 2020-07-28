package com.imooc.ad.dao;

import com.imooc.ad.entity.AdUnit;
import com.imooc.ad.entity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Jingchao Zhang
 * Date: 2020-07-27
 * Time: 8:00 PM
 */
public interface AdUnitRepository extends JpaRepository<AdUnit, Long> {

    AdUnit findByPlanIdAndUnitName(Long planId, String unitName);

    List<AdUnit> findAllByUnitStatus(Integer unitStatus);
}
