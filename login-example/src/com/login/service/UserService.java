package com.login.service;
import com.login.entity.User;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

/**
 * @author shy
 * @ClassName UserService
 * @Description 用户业务逻辑类
 * @Data 2019/9/26
 * @Version 1.0
 **/
public class UserService {
    private  List<User> userList;
    /**
     * @Description 用户数据初始化方法
     * @param null
     * @return List<User>
     */
    public  List<User> init(){
        User[] users = {
                new User(1,"aaa@qq.com","698d51a19d8a121ce581499d7b701668","松山湖","user1.jpg"),
                new User(2,"bbb@qq.com","698d51a19d8a121ce581499d7b701668","羊山北路","user2.jpg"),
                new User(3,"ccc@qq.com","698d51a19d8a121ce581499d7b701668","大学城","user3.jpg")
        };
        userList = Arrays.asList(users);
        return userList;
    }

    /**
     * @Description 用户登录，成功返回用户对象，失败返回null
     * @param account
     * @param password
     * @return com.login.entity.User
     */
    public User userLogin(String account,String password){
        for (User user : userList) {
            if (user.getAccount().equals(account)&&user.getAccount().equals(com.web.util.Md5Util.crypt(password))){
                return user;
            }
        }
        return null;
    }
    public static void main(String[] args){
        UserService us = new UserService();
        us.init();
        User user = us.userLogin("aaa@qq.com","222");
        if (user!= null){
            System.out.println(user);
        }else{
            System.out.println("登陆失败");
        }
    }
}