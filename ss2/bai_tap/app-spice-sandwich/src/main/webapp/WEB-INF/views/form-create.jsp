<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/16/2023
  Time: 10:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Sandwich Condiments</h1><br>
<form action="/create" method="post">
    <input type="checkbox" name="spice" value="Lettuce">Lettuce <br>
    <input type="checkbox" name="spice" value="Tomato">Tomato <br>
    <input type="checkbox" name="spice" value="Mustard">Mustard <br>
    <input type="checkbox" name="spice" value="Sprouts">Sprouts <br>
    <input type="submit" value="Đặt">
</form>
<br>
<span>Sandwich spice: ${result}</span>
</body>
</html>
