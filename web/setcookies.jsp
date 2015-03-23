<%--
  Created by IntelliJ IDEA.
  User: igor
  Date: 18.03.15
  Time: 22:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--Ловим данные которые ввёл пользователь--%>
<%--Храним данные в куках год--%>
<%--Добовляем куки--%>

    <%
          String login = request.getParameter("login");
           if(login != null) {
            Cookie cookie = new Cookie("login", login);
            cookie.setMaxAge(365 * 24 * 60 * 60);
            response.addCookie(cookie);
        }
    %>
<html>
<head>
    <title></title>
</head>
<body>
      <a href="showcookies.jsp">show Cookie...</a>
</body>
</html>
