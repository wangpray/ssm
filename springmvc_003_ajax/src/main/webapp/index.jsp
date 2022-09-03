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
    <script src="js/jquery-3.3.1.js"></script>
</head>
<body>
<br><br><br><br>
<a href="javascript:show()">访问服务器返回学生集合</a><br>
<div id="mydiv">等待服务器返回数据</div>
<script type="text/javascript">
    function show() {
        $.ajax({
            url: "/ajax.action",
            type: "get",
            dataType:"json",
            success:function (list) {
                var s = "";
                $.each(list, function (index, stu) {
                    s += stu.name + "--------" + stu.age + "<br>";
                });
               // 打印数据给div
                $("#mydiv").html(s);
            }
        });
    }

</script>
</body>
</html>
