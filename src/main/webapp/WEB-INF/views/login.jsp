<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>

    <title>Login Page</title>

</head>

<body>
<form action="<c:url value="/register"/>" method="POST">

<div class="container">
    <label><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="username" required>

    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>

    <label><b>Email</b></label>
    <input type="email" placeholder="Enter Email" name="email" required>

    <button type="submit">Login</button>
    <input type="checkbox" checked="checked"> Remember me
</div>

<div class="container" style="background-color:#f1f1f1 ">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
</div>
</form>

</body>

</html>
