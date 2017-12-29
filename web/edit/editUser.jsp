<%--
  Created by IntelliJ IDEA.
  User: igor
  Date: 18.03.15
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit user</title>
  <style>
    body {
      background-image: url(res/bg.jpg); /* Путь к фоновому изображению */
      background-color: #eff4f4; /* Цвет фона */
    }
  </style>
</head>
<body>
      <form align="center" action="applyEditUserServlet" method="POST">
        Id: <input type="text" name="id" value="${account.id}" readonly size="4" maxlength="4"> </font> </br>
        Login: <input value="${account.loginUser}" required="on" type="text" maxlength="20" name="login" autocomplete="on" size="20"/> </br>
        Password: <input value="${account.passwordUser}" required="on" type="password" maxlength="25" name="password" autocomplete="on" size="25"/> </br>
        First name: <input value="${account.firstNameUser}" required="on" type="text" maxlength="20" name="firstName" autocomplete="on" size="20"/> </br>
        Last name: <input value="${account.lastNameUser}" required="on" type="text" maxlength="25" name="lastName" autocomplete="on"  size="25"/> </br>
        Middle name: <input value="${account.middleName}" required="on" type="text" maxlength="25" name="middleName" autocomplete="on" size="25"/> </br>
        Personnel number: <input value="${account.personnelNumber}" required="on" type="number" min="0000" max="9999" maxlength="4" name="personnelNumber" autocomplete="on" size="4"/> </br>
        Email: <input value="${account.email}" required="on" type="email" maxlength="30" name="email" autocomplete="on" size="30" size="30"/> </br>
        Phone number: +7<input value="${account.phoneNumber}" required="on" type="number" min="0000000000" max="9999999999" maxlength="10" name="phoneNumber" autocomplete="on" size="10"/> </br>
        Create Date: "${account.createDate}" </br>
        <input type=button value=Back onClick=history.back()>
        <input type="submit" name="apply" value="Apply"/>
      </form>
</body>
</html>
