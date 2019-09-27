package com.web;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
    @Override
    protected  void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        req.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String password  = req.getParameter("password");
        req.setAttribute("username",username);
        req.setAttribute("password",password);
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
        System.out.println(username);

//       HttpSession session= req.getSession();
//        session.setAttribute("username",username);
//        session.setAttribute("password",password);
//        resp.sendRedirect("/index.jsp");


    }
}
