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
  <title>Edit and view users</title>
  <style>
  body {
  background-image: url(res/bg.jpg); /* Путь к фоновому изображению */"
  background-color: #eff4f4; /* Цвет фона */"
  }
  </style>
  </head>
<body><div> </div>
<form align="left" action="viewEditUserServlet" method="POST">
<table border="1" cellpadding="1" cellspacing="1" style="width: 500px;">
<caption>Users</caption>
<thead>
<tr>
  <th scope="col"></th>
  <th scope="col">ID</th>
  <th scope="col">PERSONAL_NUMBER</th>
  <th scope="col">FIRSTNAME</th>
  <th scope="col">LASTNAME</th>
  <th scope="col">MIDDLENAME</th>
  <th scope="col">LOGIN</th>
  <th scope="col">PASSWORD</th>
  <th scope="col">EMAIL</th>
  <th scope="col">REG_DATE</th>
  <th scope="col">PHONE_NUMBER</th>
</tr>
</thead>
<tbody>
<c:forEach items="${accountList}" var="account">
<tr>
  <td><input type="radio" name="select" value="${account.id}"></td>
  <td>${account.id}</td>
  <td>${account.personnelNumber}</td>
  <td>${account.firstNameUser}</td>
  <td>${account.lastNameUser}</td>
  <td>${account.middleName}</td>
  <td>${account.loginUser}</td>
  <td>${account.passwordUser}</td>
  <td>${account.email}</td>
  <td>${account.createDate}</td>
  <td>${account.phoneNumber}</td>
  </tr>
</c:forEach>
</tbody>
</table>
<input type=button value=Back onClick=history.back()>
<button target="_blank" type="submit">Edit user</button>
<button target="_blank" onClick="popupWin = window.open('registration/addUser.jsp', 'Add user', 'location,width=380,height=360,top=0'); popupWin.focus(); return false;">Add user</button></form>
<form align="left" action="deleteUserServlet" method="POST">
  <input value="" required="on" min="0000" max="9999" maxlength="4" type="number" name="id" />
  <input type="submit" name="delete" value="Delete"></form>
<form align="left" action="editAndViewUserServlet" method="POST">
  <input value="${search}" required="on" min="0" max="3" maxlength="1" type="number" name="search" />
  <input type="submit" name="searchButton" value="Search">
    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
    <input type="submit" name="refresh" value="Refresh"></form><p>0 - All levels of access</p><p>1 - Regular users</p><p>2 - Privileged user page</p><p>3 - Admin</p>
<p>&nbsp;</p></table>
</body>
</html>
