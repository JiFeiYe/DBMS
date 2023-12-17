<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%--
  Created by IntelliJ IDEA.
  User: LLeavee
  Date: 2023/12/17
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改详情</title>
</head>
<body>
<form action="/DBMS/InfoServlet?oper=studentupdate" method="post">
    <c:forEach var="stu" items="${sessionScope.lts}">
        学号<input type="text" name="userId" readonly="readonly" value="${stu.userId}"><br/>
        名字<input type="text" name="userName" readonly="readonly" value="${stu.userName}"><br/>
        性别<input type="text" name="userSex" value="${stu.userSex}"><br/>
        年龄<input type="text" name="userAge" value="${stu.userAge}"><br/>
        入学年份<input type="text" name="markYear" readonly="readonly" value="${stu.markYear}"><br/>
        班级<input type="text" name="classId" readonly="readonly" value="${stu.classId}"><br/>
        专业<input type="text" name="majorId" readonly="readonly" value="${stu.majorId}"><br/>
        <input type="submit" value="提交">
    </c:forEach>
</form>
<%--todo:表单验证--%>
</body>
</html>
