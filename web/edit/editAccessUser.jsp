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
      <form align="center" action="applyEditAccessUserServlet" method="POST">
        &nbsp; &nbsp; &nbsp; &nbsp;
        Id: <input type="text" name="id" value="${accessLevel.id}" readonly size="4" maxlength="4"> </font> </br>
        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
        Login: <input value="${accessLevel.loginUser}" type="text" name="login"  size="20" readonly maxlength="20"> </br>
        &nbsp;  &nbsp; &nbsp;
        Personnel number:  <input value="${accessLevel.personnelNumber}" type="number"  maxlength="4" name="personnelNumber" readonly size="4"  size="4"/> </br>
        Access: <input value="${accessLevel.access}" required="on" type="number" min="1" max="3" maxlength="1" name="access" autocomplete="on" size="1"/> </br>
        <input type=button value=Back onClick=history.back()>
        <input type="submit" name="apply" value="Apply"/>
      </form>
</body>
</html>
