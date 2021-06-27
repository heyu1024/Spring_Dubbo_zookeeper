package com.heyu.main;

import com.heyu.impl.OrderServiceImpl;
import com.heyu.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author shkstart
 * @date 2021-06-21 17:46
 */
public class MainApplication {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService = ioc.getBean(OrderService.class);
        orderService.initOrder("1");

        System.out.println("调用结束");

        System.in.read();

    }
}
