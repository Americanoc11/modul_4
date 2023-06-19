<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Email Configuration</title>
</head>
<body>
<h1>Email Configuration</h1>

<form action="/email/email-config" method="post">
    <label>Email Address:</label>
    <input type="text" name="emailAddress"/>
    <br/>
    <input type="submit" value="Save"/>
</form>

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
            <td>${emailConfig.emailAddress}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
