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
    <link rel="stylesheet" href="./css/studentdetail.css">
</head>
<body>
<form action="/DBMS/InfoServlet?oper=studentupdate" method="post">
    学号<input type="text" class="ips" name="userId" readonly="readonly" value="${sessionScope.stu.userId}"><br/>
    名字<input type="text" class="ips" name="userName" readonly="readonly" value="${sessionScope.stu.userName}"><br/>
    性别<input type="text" class="ips" name="userSex" value="${sessionScope.stu.userSex}"><br/>
    年龄<input type="text" class="ips" name="userAge" value="${sessionScope.stu.userAge}"><br/>
    入学年份<input type="text" class="ips" name="markYear" readonly="readonly"
                   value="${sessionScope.stu.markYear}"><br/>
    班级<input type="text" class="ips" name="classId" readonly="readonly" value="${sessionScope.stu.classId}"><br/>
    专业<input type="text" class="ips" name="majorId" readonly="readonly" value="${sessionScope.stu.majorId}"><br/>
    <input type="hidden" id="type" value="${sessionScope.type}">
    <input type="submit" value="提交" class="btn">
</form>
<script src="webjars/jquery/3.5.1/jquery.min.js"></script>
<script>
    <%--todo:表单验证--%>
    $(function () {
        console.log($("#type"));
        const type = $("#type").val().trim();
        console.log(type);
        if (type === "3") {
            console.log("1111111111111111ifififififif");
            $("input").removeAttr("readonly");
        }
    }) // jquery
</script>

</body>
</html>
