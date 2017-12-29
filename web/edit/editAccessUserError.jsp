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
    <title>An error occurred when the database change user access levels . Mutations both not included in the database ! Click "back " and try again .</title>
  <style>
    body {
      background-image: url(res/bg.jpg); /* Путь к фоновому изображению */
      background-color: #eff4f4; /* Цвет фона */
    }
  </style>
</head>
<body>
<form align="center">
<font align="center" color="red" >An error occurred when the database change user access levels . Mutations both not included in the database ! Click "back " and try again .</font>
  </br>
  <input type=button value=Back onClick=history.back()>
</form>
</body>
</html>
