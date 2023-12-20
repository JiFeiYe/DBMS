<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%--
  Created by IntelliJ IDEA.
  User: LLeavee
  Date: 2023/12/18
  Time: 9:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理信息</title>
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
        <th>删除</th>
    </tr>
    <c:forEach var="stu" items="${sessionScope.stults}">
        <tr>
            <td>${stu.userId}</td>
            <td>${stu.userName}</td>
            <td>${stu.userSex}</td>
            <td>${stu.userAge}</td>
            <td>${stu.markYear}</td>
            <td>${stu.classId}</td>
            <td>${stu.majorId}</td>
            <td><a href="/DBMS/InfoServlet?oper=detail&man=stu&userId=${stu.userId}" id="update_stu">修改</a></td>
            <td><a href="#" id="delete_stu">删除</a></td>
        </tr>
    </c:forEach>
</table>

<br/>

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
        <th>删除</th>
    </tr>
    <c:forEach var="teach" items="${sessionScope.tealts}">
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
            <td><a href="/DBMS/InfoServlet?oper=detail&man=teach&teachId=${teach.teachId}" id="update_teach">修改</a>
            </td>
            <td><a href="#" id="delete_teach">删除</a></td>
        </tr>
    </c:forEach>
</table>
<%--<script src="webjars/jquery/3.5.1/jquery.min.js"></script>
<script>
    $(function (){
        $("#update_stu").click(function (){
            sessionStorage.setItem("stu", ${stu})
        })
    }) //jquery
</script>--%>
</body>
</html>
