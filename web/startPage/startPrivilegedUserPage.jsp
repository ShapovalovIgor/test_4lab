<%--
  Created by IntelliJ IDEA.
  User: igor
  Date: 18.03.15
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String login = request.getParameter("login");
    if(login != null) {
        Cookie cookie = new Cookie("login", login);
        session.setAttribute("login", login);
        cookie.setMaxAge(365 * 24 * 60 * 60);
        response.addCookie(cookie);
    }
    String password = request.getParameter("password");
    if(login != null) {
        Cookie cookie = new Cookie("password", password);
        session.setAttribute("password", password);
        cookie.setMaxAge(365 * 24 * 60 * 60);
        response.addCookie(cookie);
    }
    session.setMaxInactiveInterval(20*60);
%>
<html>
<head>
    <title>Main privileged user</title>
  <style>
    body {
      background-image: url(res/bg.jpg); /* Путь к фоновому изображению */
      background-color: #eff4f4; /* Цвет фона */
    }
  </style>
</head>
<body>
</br>
<%--Регистрируем новых пользователей--%>
<form action="viewUserServlet" method="POST">
    <input type="submit" name="ViewUser" value="viewUser" />
</form>
<form action="viewAccessUserServlet" method="POST">
    <input type="submit" name="ViewAccessUser" value="viewAccessUser" />
</form>
</body>
</html>
