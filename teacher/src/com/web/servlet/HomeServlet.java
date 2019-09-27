package com.web.servlet;

/**
 * @author ymj
 * @ClassName HomeServlet
 * @Description TODO
 * @Data 2019/9/27
 * @Version 1.0
 * 拦截/home请求，获取所有图书数据，并通过服务器端转发跳转到主页
 **/
import com.web.entity.Book;
import com.web.entity.User;
import com.web.service.BookService;
import com.web.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Book> bookList = BookService.init();
        req.setAttribute("bookList", bookList);
        req.getRequestDispatcher("/home.jsp").forward(req, resp);
    }
}