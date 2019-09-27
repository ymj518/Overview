package com.web.service;

/**
 * @author ymj
 * @ClassName UserService
 * @Description TODO
 * @Data 2019/9/27
 * @Version 1.0
 **/
import com.web.entity.User;
import com.web.util.Md5Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author mqxu
 * @date 2019/9/18
 * 用户相关业务逻辑类
 */
public class UserService {
    private List<User> userList;

    public UserService() {
        init();
    }

    /**
     * 数据初始化方法
     */
    public List<User> init() {
        userList = new ArrayList<>(3);
        User[] users = {
                new User("13951905171", "698d51a19d8a121ce581499d7b701668", "开到荼蘼", "1.jpg"),
                new User("13866668888", "bcbe3365e6ac95ea2c0343a2395834dd", "小幸运", "2.jpg"),
                new User("13700001111", "310dcbbf4cce62f762a2aaa148d556bd", "往后余生", "3.jpg")
        };
        userList = Arrays.asList(users);
        return userList;
    }

    public User signIn(String account, String password) {
        for (User user : userList) {
            if (user.getAccount().equals(account) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        User user = new UserService().signIn("aaa", Md5Util.crypt("111"));
        System.out.println(user);
    }
}