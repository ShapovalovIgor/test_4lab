<%--
  Created by IntelliJ IDEA.
  User: igor
  Date: 18.03.15
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>You have entered login or personal number that already exists in the database . Enter another number or username is not in the database .</title>
  <style>
    body {
      background-image: url(res/bg.jpg); /* Путь к фоновому изображению */
      background-color: #eff4f4; /* Цвет фона */
    }
  </style>
</head>
<body>
<form align="center">
<font align="center" color="red" >You have entered login or personal number that already exists in the database . Click "Back" and  enter another number or username is not in the database .</font>
  </br>
  <input type=button value=Back onClick=history.back()>
</form>
</body>
</html>
