package com.imooc.ad.service;

import com.imooc.ad.exception.AdException;
import com.imooc.ad.vo.AdUnitRequest;
import com.imooc.ad.vo.AdUnitResponse;

/**
 * Created by Jingchao Zhang
 * Date: 2020-07-31
 * Time: 8:44 AM
 */
public interface IAdUnitService {

    AdUnitResponse createUnit(AdUnitRequest request) throws AdException;
}
