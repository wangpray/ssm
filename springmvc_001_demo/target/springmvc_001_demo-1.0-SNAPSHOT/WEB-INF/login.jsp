<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/9/1
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/login">
    账号：<input name="account"><br>
    密码：<input type="password" name="password"><br>
    <input type="submit" value="登录"><br>
    ${fail}
</form>
</body>
</html>
