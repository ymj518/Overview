<%--
  Created by IntelliJ IDEA.
  User: 12396
  Date: 2019/9/21
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>首页</title>
</head>
<body>
<h2>首页</h2>>
<ul>
  <li>
    服务器端转跳的用户名：<%=request.getAttribute("username")%>
    服务器端转跳的密码：<%=request.getAttribute("password")%>
  </li>

  <%--      <li>--%>
  <%--      服务器端转跳的用户名：<%=session.getAttribute("username")%>--%>
  <%--      服务器端转跳的密码：<%=session.getAttribute("password")%>--%>
  <%--      </li>--%>
</ul>
<br>
<a href="login.html">点击返回登陆页面</a>

</body>
</html>
