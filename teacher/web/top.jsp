<%--
  Created by IntelliJ IDEA.
  User: 12396
  Date: 2019/9/27
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>

<%@ page import="com.web.entity.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    User user = (User) session.getAttribute("user");
    pageContext.setAttribute("user", user);
%>
<ul>
    <li>
        <a href="home">首页</a>
    </li>
    <li>
        <a href="#">读书</a>
    </li>
    <li>
        <a href="#">音乐</a>
    </li>
    <li>
        <a href="#">小组</a>
    </li>
    <li>
        <a href="#">同城</a>
    </li>
    <li>
        <a href="#">FM</a>
    </li>
    <li>
        <a href="#">时间</a>
    </li>
    <li>
        <a href="#">更多</a>
    </li>
</ul>
<ul>

    <%
        if (user != null) {
    %>
    <li>
        <a href="person.jsp">
            <img src="images/${user.avatar}" alt="" class="avatar">
        </a>
    </li>
    <li>
        <a href="logout.jsp">退出</a>
    </li>
    <%
    } else {
    %>
    <a href="${pageContext.request.contextPath}/sign_in.html">去登录</a>
    <%
        }
    %>
</ul>