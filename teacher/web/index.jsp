<%--
  Created by IntelliJ IDEA.
  User: 12396
  Date: 2019/9/27
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>首页</title>
</head>
<body>
<h3>
  欢迎你:<%=session.getAttribute("username")%>
</h3>
</body>
</html>