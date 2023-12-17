<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%--
  Created by IntelliJ IDEA.
  User: LLeavee
  Date: 2023/12/17
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息</title>
</head>
<body>
<table border="1" cellspacing="0" width="700" align="center">
    <tr>
        <th>学号</th>
        <th>名字</th>
        <th>性别</th>
        <th>年龄</th>
        <th>入学年份</th>
        <th>班级</th>
        <th>专业</th>
        <th>修改</th>
    </tr>
    <c:forEach var="stu" items="${sessionScope.lts}">
        <tr>
            <td>${stu.userId}</td>
            <td>${stu.userName}</td>
            <td>${stu.userSex}</td>
            <td>${stu.userAge}</td>
            <td>${stu.markYear}</td>
            <td>${stu.classId}</td>
            <td>${stu.majorId}</td>
            <td><a href="studentdetail.jsp">修改</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
