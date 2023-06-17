<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/16/2023
  Time: 11:29 AM
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
<h3>
    Calculator
</h3>
<form action="/calculatorC/calculator" method="post">
    <span>Operator 1:</span><br>
    <input type="number" name="operator1"><br>
    <span>Operator 2:</span><br>
    <input type="number" name="operator2"><br>
    <input type="submit" name="calculations" value="addition"><br>
    <input type="submit" name="calculations" value="subtraction"><br>
    <input type="submit" name="calculations" value="multiplication"><br>
    <input type="submit" name="calculations" value="division"><br>
    <br>
    <input type="submit" value="send">
</form>
<span>Operator 1:${operator1}</span><br>
<span>Operator 2:${operator2}</span><br>
<span>Result: ${result}</span>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>
