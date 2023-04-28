<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/28/2023
  Time: 11:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<div class="container">
    <div class="row">
        <div class="col-12">
            <h1 style="text-align: center">User Manager</h1>
        </div>
    </div>
    <button type="submit"
            onclick="window.location.href='/user?actionUser=create'">
        Create new user
    </button>
    <br>
    <form>
        <input type="search" name="search"> <br>
        <button type="submit"
                onclick="window.location.href='/user?actionUser=search'">
            search
        </button>
    </form>
    <button type="submit"
            onclick="window.location.href='/user?actionUser=off'">
        List user off
    </button>
    <br>
    <h3>List user</h3><br>
    <table>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Country</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        <c:forEach var="user" items="${userList}" varStatus="loop">
            <tr>
                <td>${user.getId()}</td>
                <td>${user.getName()}</td>
                <td>${user.getEmail()}</td>
                <td>${user.getCountry()}</td>
                <td>
                    <button type="submit"
                            onclick="window.location.href='/user?actionUser=update&id=${user.getId()}'">
                        Update
                    </button>
                </td>
                <td>
                    <button type="submit"
                            onclick="window.location.href='/user?actionUser=delete&id=${user.getId()}'">
                        Delete
                    </button>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>
