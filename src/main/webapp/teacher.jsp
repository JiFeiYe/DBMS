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
    <link rel="stylesheet" href="./css/teacher.css">
</head>
<body>
<div class="container">
    <div class="profile-card">
        <div class="profile-image">
            <img src="./images/img3.jpg" alt="Profile Picture">
        </div>
        <div class="profile-details">
            <h1>${sessionScope.teach.teachName}</h1>
            <p>${sessionScope.teach.teachId}</p>
            <div class="info">
                <p><strong>Sex:</strong> ${sessionScope.teach.teachSex}</p>
                <p><strong>Age:</strong> ${sessionScope.teach.teachAge}</p>
                <p><strong>Degree:</strong> ${sessionScope.teach.degree}</p>
                <p><strong>Title:</strong> ${sessionScope.teach.title}</p>
                <p><strong>TeachYear:</strong> ${sessionScope.teach.teachYear}</p>
                <p><strong>RoomId:</strong> ${sessionScope.teach.roomId}</p>
                <p><strong>ClassId:</strong> ${sessionScope.teach.classId}</p>
                <a href="teacherdetail.jsp" class="revise">修改</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>
