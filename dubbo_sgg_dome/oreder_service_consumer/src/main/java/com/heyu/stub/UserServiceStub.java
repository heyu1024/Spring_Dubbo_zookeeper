//package com.heyu.stub;
//
//import com.heyu.bean.UserAddress;
//import com.heyu.service.UserService;
//import org.springframework.util.StringUtils;
//
//import java.util.List;
//
///**
// * @author shkstart
// * @date 2021-06-23 20:52
// */
//public class UserServiceStub implements UserService
//{
//
//    private final UserService userService;
//
//    /**
//     * 传入的是userservice的远程代理对象
//     * @param userService
//     */
//    public UserServiceStub(UserService userService) {
//        this.userService = userService;
//    }
//
//    @Override
//    public List<UserAddress> getUserAddressList(String userId) {
//        System.out.println("本地存根被调用");
//        if(!StringUtils.isEmpty(userId)){
//            return userService.getUserAddressList(userId);
//        }
//        return null;
//    }
//}
