package com.imooc.ad.controller;

import com.alibaba.fastjson.JSON;
import com.imooc.ad.exception.AdException;
import com.imooc.ad.service.IUserService;
import com.imooc.ad.vo.CreateUserRequest;
import com.imooc.ad.vo.CreateUserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jingchao Zhang
 * Date: 2020-07-31
 * Time: 9:53 PM
 */
@Slf4j
@RestController
public class UserOPController {

    private final IUserService userService;

    public UserOPController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create/user")
    public CreateUserResponse createUser(@RequestBody CreateUserRequest request) throws AdException {
        log.info("ad-sponsor: createUser -> {}", JSON.toJSONString(request));
        return userService.createUser(request);
    }
}