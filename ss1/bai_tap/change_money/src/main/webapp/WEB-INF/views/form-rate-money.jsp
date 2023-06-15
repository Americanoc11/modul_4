<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/15/2023
  Time: 2:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/change" method="post">
    <span>Usd:</span><br>
    <input type="text" name="usd">
    <input type="submit" value="đổi">
</form>
<span>Result: ${result}đ</span>
</body>
</html>
