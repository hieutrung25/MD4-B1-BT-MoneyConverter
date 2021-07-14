<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: MSI
  Date: 7/14/2021
  Time: 10:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Money Converter</title>
</head>
<body>

<form:form method="post" modelAttribute="converter">
    Rate
    <form:input path="rate"/>
    Money
    <form:input path="value"/>
    <input type="submit" value="submit">
</form:form>
<p>Result: ${result}</p>
</body>
</html>
