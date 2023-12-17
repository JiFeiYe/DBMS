<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%--
  Created by IntelliJ IDEA.
  User: LLeavee
  Date: 2023/12/17
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>老师信息</title>
</head>
<body>
<table border="1" cellspacing="0" width="700" align="center">
    <tr>
        <th>职工号</th>
        <th>名字</th>
        <th>性别</th>
        <th>年龄</th>
        <th>学历</th>
        <th>职称</th>
        <th>入职时间</th>
        <th>办公室</th>
        <th>教室</th>
        <th>修改</th>
    </tr>
    <c:forEach var="teach" items="${sessionScope.lts}">
        <tr>
            <td>${teach.teachId}</td>
            <td>${teach.teachName}</td>
            <td>${teach.teachSex}</td>
            <td>${teach.teachAge}</td>
            <td>${teach.degree}</td>
            <td>${teach.title}</td>
            <td>${teach.teachYear}</td>
            <td>${teach.roomId}</td>
            <td>${teach.classId}</td>
            <td><a href="#">修改</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
