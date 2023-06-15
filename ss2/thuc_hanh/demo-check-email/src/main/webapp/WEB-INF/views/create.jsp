<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/15/2023
  Time: 7:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
hello, this is form input email
<form action="/create" method="post">
    <span>Email:</span><br>
    <input type="text" name="email" value="Input your email!"><br>
    <input type="submit" value="Check email">
</form>
<span>Result: ${result}</span>
</body>
</html>
