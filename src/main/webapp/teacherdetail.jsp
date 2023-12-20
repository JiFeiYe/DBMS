<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%--
  Created by IntelliJ IDEA.
  User: LLeavee
  Date: 2023/12/17
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改详情</title>
    <link rel="stylesheet" href="./css/teacherdetail.css">
</head>
<body>
<form action="/DBMS/InfoServlet?oper=teacherupdate" method="post">
    职工<input type="text" name="teachId" readonly="readonly" value="${sessionScope.teach.teachId}"><br/>
    名字<input type="text" name="teachName" readonly="readonly" value="${sessionScope.teach.teachName}"><br/>
    性别<input type="text" name="teachSex" value="${sessionScope.teach.teachSex}"><br/>
    年龄<input type="text" name="teachAge" value="${sessionScope.teach.teachAge}"><br/>
    学历<input type="text" name="degree" value="${sessionScope.teach.degree}"><br/>
    职称<input type="text" name="title" value="${sessionScope.teach.title}"><br/>
    入职时间<input type="text" name="teachYear" readonly="readonly" value="${sessionScope.teach.teachYear}"><br/>
    办公室<input type="text" name="roomId" value="${sessionScope.teach.roomId}"><br/>
    教室<input type="text" name="classId" value="${sessionScope.teach.classId}"><br/>
    <input type="hidden" id="type" value="${sessionScope.type}">
    <input type="submit" value="提交">
</form>
<script src="webjars/jquery/3.5.1/jquery.min.js"></script>
<script>
    <%--todo:表单验证--%>
    $(function () {
        const type = $("#type").val().trim();
        if (type === "3") {
            $("input").removeAttr("readonly");
        }
    }) // jquery
</script>
</body>
</html>
