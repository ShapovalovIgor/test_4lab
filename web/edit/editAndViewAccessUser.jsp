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
  <title>Edit and view access users</title>
  <style>
  body {
  background-image: url(res/bg.jpg); /* Путь к фоновому изображению */"
  background-color: #eff4f4; /* Цвет фона */"
  }
  </style>
  </head>
<body><div> </div>
<form align="left" action="viewEditAccessUserServlet" method="POST">
<table border="1" cellpadding="1" cellspacing="1" style="width: 500px;">
<caption>Access users</caption>
<thead>
<tr>
  <th scope="col"></th>
  <th scope="col">ID</th>
  <th scope="col">PERSONAL_NUMBER</th>
  <th scope="col">LOGIN</th>
  <th scope="col">ACCESS</th>
</tr>
</thead>
<tbody>
<c:forEach items="${accessLevelList}" var="access">
<tr>
  <td><input type="radio" name="select" value="${access.id}"></td>
  <td>${access.id}</td>
  <td>${access.personnelNumber}</td>
  <td>${access.loginUser}</td>
  <td>${access.access}</td>
  </tr>
</c:forEach>
</tbody>
</table>
<input type=button value=Back onClick=history.back()>
<button target="_blank" type="submit">Edit access</button></form>
<form align="left" action="editAndViewAccessUserServlet" method="POST">
  <input value="${search}" required="on" min="0" max="3" maxlength="1" type="number" name="search" />
  <input type="submit" name="searchButton" value="Search">
  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
    <input type="submit" name="refresh" value="Refresh"></form><p>0 - All levels of access</p><p>1 - Regular users</p><p>2 - Privileged user page</p><p>3 - Admin</p>
<p>&nbsp;</p></table>
</body>
</html>
