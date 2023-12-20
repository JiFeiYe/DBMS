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
    <link rel="stylesheet" href="./css/student.css">
</head>
<body>
<div class="container">
    <div class="profile-card">
        <div class="profile-image">
            <img src="./images/img1.jpg" alt="Profile Picture">
        </div>
        <div class="profile-details">
            <h1>${sessionScope.stu.userName}</h1>
            <p>${sessionScope.stu.userId}</p>
            <div class="info">
                <p><strong>Sex:</strong> ${sessionScope.stu.userSex}</p>
                <p><strong>Age:</strong> ${sessionScope.stu.userAge}</p>
                <p><strong>MarkYear:</strong> ${sessionScope.stu.markYear}</p>
                <p><strong>ClassId:</strong> ${sessionScope.stu.classId}</p>
                <p><strong>MajorId:</strong> ${sessionScope.stu.majorId}</p>
                <a href="studentdetail.jsp" class="revise">修改</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>
