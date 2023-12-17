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
</head>
<body>
<form action="/DBMS/InfoServlet?oper=teacherupdate" method="post">
    <c:forEach var="teach" items="${sessionScope.lts}">
        职工<input type="text" name="teachId" readonly="readonly" value="${teach.teachId}"><br/>
        名字<input type="text" name="teachName" readonly="readonly" value="${teach.teachName}"><br/>
        性别<input type="text" name="teachSex" value="${teach.teachSex}"><br/>
        年龄<input type="text" name="teachAge" value="${teach.teachAge}"><br/>
        学历<input type="text" name="degree" value="${teach.degree}"><br/>
        职称<input type="text" name="title" value="${teach.title}"><br/>
        入职时间<input type="text" name="teachYear" readonly="readonly" value="${teach.teachYear}"><br/>
        办公室<input type="text" name="roomId" value="${teach.roomId}"><br/>
        教室<input type="text" name="classId" value="${teach.classId}"><br/>
        <input type="submit" value="提交">
    </c:forEach>
</form>
<%--todo:表单验证--%>
</body>
</html>
