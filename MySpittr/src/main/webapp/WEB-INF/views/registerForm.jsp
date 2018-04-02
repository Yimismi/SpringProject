<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yimi
  Date: 18-4-2
  Time: 下午8:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css"/>">
</head>
<body>
    <h1>Register</h1>
    <form method="POST" >
        FirstName: <input type="text" name="firstName"/> <br/>
        LastName: <input type="text" name="lastName"/> <br/>
        Email: <input type="email" name="email"/> <br/>
        Tel: <input type="tel" name="tel"/> <br/>
        Username: <input type="text" name="username"/> <br/>
        Password: <input type="password" name="password"/> <br/>
        <input type="submit" name="submit" value="register"/>
    </form>
</body>
</html>
