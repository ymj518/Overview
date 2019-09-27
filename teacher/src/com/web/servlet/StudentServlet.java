package com.web.servlet;

/**
 * @author ymj
 * @ClassName StudentServlet
 * @Description TODO
 * @Data 2019/9/27
 * @Version 1.0
 * 拦截/students请求，创建一组学生记录，通过服务器转发带到目标页面
 **/
import com.web.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(urlPatterns = "/students")
public class StudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student[] students = {
                new Student(1, "张无忌", "男", 21),
                new Student(2, "张碧晨", "女", 22),
                new Student(3, "张韶涵", "女", 23),
                new Student(4, "张杰", "男", 24)
        };
        List<Student> studentList = Arrays.asList(students);
        req.setAttribute("studentList", studentList);
        req.getRequestDispatcher("/student.jsp").forward(req, resp);
    }
}