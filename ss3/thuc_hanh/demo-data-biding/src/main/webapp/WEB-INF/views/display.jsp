<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/17/2023
  Time: 11:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<button type="submit" class="btn btn-primary"
onclick="window.location.href='/create.jsp'">
    create new user
</button>
<%--<table class="table">--%>
<%--    <tr>--%>
<%--        <th>Id</th>--%>
<%--        <th>Name</th>--%>
<%--        <th>Gender</th>--%>
<%--        <th>Is Admin</th>--%>
<%--        <th>Hobbie</th>--%>
<%--        <th>Type</th>--%>
<%--        <th>Country</th>--%>
<%--    </tr>--%>
<%--    <c:forEach var="element" items="${user}">--%>
<%--        <tr>--%>
<%--            <td>${element.id}</td>--%>
<%--            <td>${element.name}</td>--%>
<%--            <td>${element.gender}</td>--%>
<%--            <td>${element.admin}</td>--%>
<%--            <td>${element.hobbie}</td>--%>
<%--            <td>${element.type}</td>--%>
<%--            <td>${element.country}</td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--</table>--%>
<p>${user.id}</p>
<p>${user.name}</p>
<p>${user.gender}</p>
<p>${user.admin}</p>
<p>${user.hobbie}</p>
<p>${user.type}</p>
<p>${user.country}</p>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>
