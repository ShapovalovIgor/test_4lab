<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="ru.shapovalov.Beans.entity.Account" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: igor
  Date: 13.04.15
  Time: 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Access Levl Users</title>
  <style>
  body {
  background-image: url(res/bg.jpg); /* Путь к фоновому изображению */"
  background-color: #eff4f4; /* Цвет фона */"
  }
  </style>
  </head>
<body><div> </div>
<table border="1" cellpadding="1" cellspacing="1" style="width: 500px;">
<caption>Access Levl Users</caption>
<thead>
<tr>
  <th scope="col">ID</th>
  <th scope="col">PERSONAL_NUMBER</th>
  <th scope="col">LOGIN</th>
  <th scope="col">ACCESS</th>
</tr>
</thead>
<tbody>
<c:forEach items="${accessLevelList}" var="access">
<tr>
  <td>${access.id}</td>
  <td>${access.personnelNumber}</td>
  <td>${access.loginUser}</td>
  <td>${access.access}</td>
  </tr>
</c:forEach>
</tbody>
</table>
<form align="left" action="viewAccessUserServlet" method="POST"><input value="${search}" required="on" min="0" max="3" maxlength="1" type="number" name="search" /><input type="submit" name="searchButton" value="Search"><p>0 - All levels of access</p><p>1 - Regular users</p><p>2 - Privileged user page</p><p>3 - Admin</p></form>
<form align="center" action="viewAccessUserServlet" method="POST"><input type=button value=Back onClick=history.back()><input type="submit" name="refresh" value="Refresh"></form>
<p>&nbsp;</p></table>
</body>
</html>
