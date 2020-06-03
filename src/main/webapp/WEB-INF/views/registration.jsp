<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 017zo
  Date: 03.06.2020
  Time: 12:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v4.0.1">
    <title>Registration</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.5/examples/sign-in/">

    <!-- Bootstrap core CSS -->
    <link href="styles/css/bootstrap.css" type="text/css" rel="stylesheet">

    <style>
        .bd-placeholder-img {
            font-size: 1.125rem;
            text-anchor: middle;
            -webkit-user-select: none;
            -moz-user-select: none;
            -ms-user-select: none;
            user-select: none;
        }

        @media (min-width: 768px) {
            .bd-placeholder-img-lg {
                font-size: 3.5rem;
            }
        }
    </style>
</head>

<body class="text-center">
<form class="form-signin">
<form:form method="get" action="registration" >

    <%--@declare id="inputlogin"--%>
    <%--@declare id="inputusername"--%><link href="styles/css/signin.css" rel="stylesheet">
    <img class="mb-4" src="styles/brand/bootstrap-solid.svg" alt="" width="72" height="72">
    <h1 class="h3 mb-3 font-weight-normal">Registration form</h1>
    <label for="inputLogin" class="sr-only">Input Login</label>
    <input type="login" id="inputLogin" class="form-control" placeholder="login" required autofocus>
    <label for="inputPassword" class="sr-only">Input Password</label>
    <input type="password" id="inputPassword" class="form-control" placeholder="password" required>
    <label for="inputUsername" class="sr-only">Input Username</label>
    <input type="username" id="inputUsername" class="form-control" placeholder="username" required>
    <div class="checkbox mb-3">

    </div>
    <button class="btn btn-lg btn-primary btn-block" type="submit">Registration</button>
    <p class="mt-5 mb-3 text-muted"></p>
</form:form>
</form>
</body>


</html>
