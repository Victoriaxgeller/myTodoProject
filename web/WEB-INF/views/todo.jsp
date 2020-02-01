<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>TODO's</title>

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

        .nav{
            font-size: 25px;
            padding-right: 25px;
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

    <ul class="nav navbar-nav navbar-right">
        <li><a href="/logout">Logout</a></li>
    </ul>

</nav>

<div class="container">
    <font color="blue" size="12px"> Welcome ${username}! </font>

    <p>Your Todo's are:</p><br>

    <ol>
        <c:forEach items="${todos}" var="todo">
            <li>${todo.name} &nbsp; &nbsp; <a href="/delete/todo?todo=${todo.name}">Delete</a></li>
        </c:forEach>

    </ol>

    <form action="/add/todo" method="post">
        New todo: <input type="text" name="todo"/> <input type="submit" value="ADD">
    </form>
</div>

<footer class="footer">
</footer>


<script
        src="https://code.jquery.com/jquery-3.4.1.js"
        integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"
        integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd"
        crossorigin="anonymous"></script>

</body>

</html>
