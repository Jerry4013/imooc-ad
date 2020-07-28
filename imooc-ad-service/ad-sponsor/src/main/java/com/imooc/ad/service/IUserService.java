package com.imooc.ad.service;

import com.imooc.ad.exception.AdException;
import com.imooc.ad.vo.CreateUserRequest;
import com.imooc.ad.vo.CreateUserResponse;

/**
 * Created by Jingchao Zhang
 * Date: 2020-07-27
 * Time: 11:57 PM
 */
public interface IUserService {

    CreateUserResponse createUser(CreateUserRequest request) throws AdException;
}
