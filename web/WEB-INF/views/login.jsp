<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: viktoriia
  Date: 2020-01-29
  Time: 07:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>YAHOOOO</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"
          integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">


    <style>
        .footer {
            position: absolute;
            bottom: 0;
            width: 100%;
            height: 60px;
            background-color: #f5f5f5;
        }

        .container {
            position: absolute;
            background-color: #f5f5f5;
            width: 100%;
        }
    </style>
</head>

<body>

<nav class="navbar navbar-default">

    <ul class="nav navbar-nav">
        <li><a href="/" class="navbar-brand">Home</a></li>
        <li><a href="/list/todo" class="navbar-brand">Todos</a></li>
        <li><a href="https://www.facebook.com/victoria.geller.3" class="navbar-brand">Facebook</a></li>
    </ul>

</nav>


<footer class="footer">
</footer>

<div class="container">

    <p><font color="#006400">${welcomeText}</font></p>

    <form action="/login" method="post">
        Enter your name <input type="text" name="username"/>
        Enter your password <input type="password" name="userpassword"/>
        <input type="submit" value="Log in"/>
    </form>
    <p><font color="red">${errorMessage}</font></p>

</div>
<script
        src="https://code.jquery.com/jquery-3.4.1.js"
        integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"
        integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd"
        crossorigin="anonymous"></script>
</body>
</html>
