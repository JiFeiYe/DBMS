<%@ page import="com.tu.dao.LoginDAO" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%--
  Created by IntelliJ IDEA.
  User: LLeavee
  Date: 2023/12/17
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
</head>
<body>
<%
    LoginDAO ld = new LoginDAO();
    int ii = ld.isLogin("lisi", "123456");
    System.out.println(ii);
%>
</body>
</html>
