package com.imooc.ad.dao;

import com.imooc.ad.entity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Jingchao Zhang
 * Date: 2020-07-27
 * Time: 7:55 PM
 */
public interface AdUserRepository extends JpaRepository<AdUser, Long> {

    AdUser findByUsername(String username);
}
