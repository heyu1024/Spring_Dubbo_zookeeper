package com.heyu.service;

import com.heyu.bean.UserAddress;

import java.util.List;

/**
 * @author shkstart
 * @date 2021-06-21 16:54
 */
public interface OrderService {
    /**
     * 根据用户id初始化订单
     *
     * @param userId
     */
    public List<UserAddress> initOrder(String userId);
}
