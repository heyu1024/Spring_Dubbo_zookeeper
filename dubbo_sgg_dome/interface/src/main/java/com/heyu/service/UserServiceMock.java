package com.heyu.service;

import com.heyu.bean.UserAddress;

import java.util.List;

/**
 * @author shkstart
 * @date 2021-06-24 16:12
 */
public class UserServiceMock implements UserService{
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("服务调用失败");
        return null;
    }
}
