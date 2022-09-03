<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/8/30
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/one.action">
    姓名：<input type="text" name="name">
    年龄：<input name="age"><br>
    <input type="submit" value="提交"><br>
</form>
<tr>
    <td>中文有没有乱码呢？</td>
</tr>
<%--标签提交url，请求参数名不能重复，否则会出现400错误--%>
<form action="/two.action">
    姓名：<input type="text" name="name">
    年龄：<input name="age"><br>
    <input type="submit" value="封装数据提交">
</form>
<form action="/four.action">
    姓名：<input type="text" name="name">
    年龄：<input type="text" name="age"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
