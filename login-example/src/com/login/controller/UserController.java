package com.login.controller;

import com.login.entity.User;
import com.login.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author ymj
 * @ClassName UserController
 * @Description TODO
 * @Data 2019/9/26
 * @Version 1.0
 **/
@WebServlet(urlPatterns = "/login")
public class UserController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{
        //去除请求参数
        String account = req.getParameter("account");
        String password = req.getParameter("password");
        //创建userService对象
        UserService us = new UserService();
        //初始化数据
        us.init();
        //调用登录功能，得到用户
        User user = us.userLogin(account,password);
        if (user != null) {
            HttpSession session = req.getSession();
            session.setAttribute("user",user);
            resp.sendRedirect("index");
        }else{
            resp.getWriter().print("error");
        }
    }
}

