<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yimi
  Date: 18-4-1
  Time: 下午11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MySpittr</title>
    <link rel="stylesheet"
          type="text/css"
          href="<c:url value="/resources/style.css"/>" >
</head>
<body>
    <h1>Welcome to Spitter</h1>
    <a href="<c:url value="/spittles"/>" >
        Spittles
    </a> |
    <a href="<c:url value="/spitter/register" />">
        Register
    </a>
</body>
</html>
