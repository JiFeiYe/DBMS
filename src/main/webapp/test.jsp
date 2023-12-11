<%@ page import="com.tu.dao.LoginDAO" %><%--
  Created by IntelliJ IDEA.
  User: LLeavee
  Date: 2023/12/9
  Time: 21:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试</title>
</head>
<body>
<%
    LoginDAO ld = new LoginDAO();
    boolean isD = ld.isLogin("lisi", "123456");
    System.out.println(isD);

%>
</body>
</html>
