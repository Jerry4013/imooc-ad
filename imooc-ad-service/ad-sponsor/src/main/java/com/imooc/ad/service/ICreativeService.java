package com.imooc.ad.service;

import com.imooc.ad.vo.CreativeRequest;
import com.imooc.ad.vo.CreativeResponse;

/**
 * Created by Jingchao Zhang
 * Date: 2020-07-31
 * Time: 7:35 PM
 */
public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
