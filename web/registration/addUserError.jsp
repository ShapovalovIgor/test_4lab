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
    <title>This username already exists, enter a different username.</title>
  <style>
    body {
      background-image: url(res/bg.jpg); /* Путь к фоновому изображению */
      background-color: #eff4f4; /* Цвет фона */
    }
  </style>
</head>
<body>
<form align="center">
<font align="center" color="red" >This username already exists, enter a different username.</font>
  </br>
  </form>
<%@include file="addUser.jsp"%>
</body>
</html>
