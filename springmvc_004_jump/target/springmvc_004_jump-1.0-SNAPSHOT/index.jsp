<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/8/29
  Time: 20:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<br><br><br><br>
<a href="/one.action">1.请求转发链接</a><br>
<a href="/two.action">请求转发action</a><br>
<a href="/three.action">3.重定向转发链接</a><br>
<a href="/four.action">重定向转发action</a><br>
<a href="/data.action">4.请求来自于data的数据</a>

<br><br><br>
<form action="/myDate.action">
    选择日期<input type="date" name="selectDate">
    <input type="submit" value="提交">
</form>


</body>
</html>
