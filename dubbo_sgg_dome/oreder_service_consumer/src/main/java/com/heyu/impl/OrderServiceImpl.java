package com.heyu.impl;


import com.heyu.bean.UserAddress;
import com.heyu.service.OrderService;
import com.heyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 1.将服务提供者 注册到注册中心（如何暴露服务）
 * 1.1 导入dubbo依赖，zookeeper客户端
 * 1.2 配置服务提供者
 * 2.让服务消费者去注册中心订阅服务提供者的服务地址
 *
 * @author shkstart
 * @date 2021-06-21 16:56
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户id：" + userId);

        //1.查询用户收货地址
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : userAddressList) {
            System.out.println(userAddress);
        }
        return userAddressList;
    }
}
