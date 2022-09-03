<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/8/29
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--导入标签库--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>main.......................</h2>
<%-- Student stu = new Student("宁姚",30);
        request.setAttribute("requestStu",stu);
        session.setAttribute("sessionStu", stu);
        model.addAttribute("modelStu",stu);
        map.put("mapStu", stu);
        modelMap.addAttribute("modelMapStu", stu);--%>
request-----------${requestStu}----${requestStu.name}-----${requestStu.age}<br>
<%--sessionStu-----------${sessionStu}<br>--%>
modelStu-----------${modelStu}<br>
mapStu-----------${mapStu}<br>
modelMapStu-----------${modelMapStu}<br>
<br>
<br>

<%--使用数据进行展示
            注意：foreach的循环中 必须要用EL的表达式，必须用${}的方式。
--%>
<table width="300px" border="1">
    <caption>学生信息</caption>
    <tr>
        <td>姓名</td>
        <td>年龄</td>
    </tr>
    <c:forEach items="${list}" var="stu">
        <tr>
            <td>${stu.name}</td>
            <td>${stu.age}</td>
        </tr>
    </c:forEach>
</table>
最初的时间格式：${primal}<br>
格式化的时间格式：${format}<br>
jstl标签的格式化：<fmt:formatDate value="${primal}" pattern="yyyy-MM-dd HH:mm"></fmt:formatDate>
</body>
</html>
