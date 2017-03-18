<%--
  Created by IntelliJ IDEA.
  User: anton
  Date: 3/18/17
  Time: 2:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
    <% if (request.getParameterMap().get("userExist") != null) { %>
        <h1>User is already exists!</h1>
    <% } else {}%>
        <h1>You have successfully registered!</h1>
    <% } %>
</body>
</html>
