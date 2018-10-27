<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 27.10.2018
  Time: 12:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/cats" method="post">
Rasa: <input type="text" name="rasa"/><br>
Imię: <input type="text" name="imie"/><br>
Właściciel: <input type="text" name="wlasciciel"/><br>
    <input type="submit" value="Dodaj"/>
</form>

<form>
    <form action="/cats" method="get">
    <input type="text" name="find">
    <select name="filed">
        <option>rasa</option>
        <option>imie</option>
        <option>wlasciciel</option>
    </select>
        <input type="submit" value="search">
</form>


KOT:<br>
    <c:forEach var="cat" items="${allcats}">
    <c:out value="${cat.rasa}"/><br>
    <c:out value="${cat.imie}"/><br>
    <c:out value="${cat.wlasciciel}"/><br>
    </c:forEach>
</body>
</html>
