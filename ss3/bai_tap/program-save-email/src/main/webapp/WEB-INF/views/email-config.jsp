<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


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
<h1>Email Configuration</h1>
<form:form action="/email-config" method="post" modelAttribute="emailConfig">
    <form:label path="emailAddress"/>Email Address
    <br>
    <form:input  path="emailAddress" id="email"/>
    <br/>
    <form:label path="describe"/>Describe:
    <br>
    <form:input  path="describe"/>
    <br/>
    <form:label path="language"/>Languages:
    <br>
    <form:select path="language">
        <form:option value="English"></form:option>
        <form:option value="Vietnamese"></form:option>
        <form:option value="Japanese"></form:option>
        <form:option value="Chinese"></form:option>
    </form:select>
    <br/>
    <form:label path="pageSize"/>Page Size:
    <br>
    <form:select path="pageSize">
        <form:option value="5"></form:option>
        <form:option value="10"></form:option>
        <form:option value="15"></form:option>
        <form:option value="25"></form:option>
        <form:option value="50"></form:option>
        <form:option value="100"></form:option>
    </form:select>
    <br/>
    <form:label path="spamFillter"/>Spams fillter
    <br>
    <form:checkbox path="spamFillter" /> Enable spams filter
    <br/>
    <input type="submit" value="Save"/>
</form:form>

<h2>Existing Email Configurations:</h2>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Email Address</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="emailConfig" items="${emailConfigs}">
        <tr>
            <td>${emailConfig.id}</td>
            <td>
                <a href="/details?id=${emailConfig.id}" style="text-decoration: none">
                        ${emailConfig.emailAddress}
                </a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>