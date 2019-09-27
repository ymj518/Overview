<%--
  Created by IntelliJ IDEA.
  User: 12396
  Date: 2019/9/27
  Time: 22:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.web.entity.Student" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息显示</title>
    <style type="text/css">
        .container {
            width: 80%;
            margin: 0 auto;
            background-color: #9b9b9b;
            padding-top: 10px;
            padding-bottom: 10px;
        }
        .item {
            width: 80%;
            margin: 5 auto;
            height: 80px;
            background-color: #eee;
            display: flex;
            align-items: center;
            justify-content: center;
            padding: 5px 5px 5px 5px;
        }
        .item span {
            margin-right: 10px;
        }
    </style>
</head>
<body>
<div class="container">
    <%
        List<Student> studentList = (List<Student>) request.getAttribute("studentList");
        for (Student student : studentList) {
            pageContext.setAttribute("student", student);
    %>
    <div class="item">
        <span>${student.id}</span>
        <span>${student.name}</span>
        <span>${student.gender}</span>
        <span>${student.age}</span>
    </div>
    <%
        }
    %>
</div>
</body>
</html>