<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yimi
  Date: 18-4-2
  Time: 下午10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css"/>">
</head>
<body>
    <h1>Your Profile</h1>
    <c:out value="${spitter.username}" /> <br/>
    <c:out value="${spitter.firstName}" /> <br/>
    <c:out value="${spitter.secondName}" /> <br/>
</body>
</html>
