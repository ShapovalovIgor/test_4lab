<%--
  Created by IntelliJ IDEA.
  User: igor
  Date: 18.03.15
  Time: 22:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
      <%--Просматриваем куки--%>
<%--Ищем куки--%>
<%
            String myCookie = "login";
            Cookie []cookies = request.getCookies();
            Cookie cookie = null;
            if(cookies != null){
            for(int i = 0; i < cookies.length; i++){
              String cookieName = cookies[i].getName();
              if(cookieName.equals(myCookie)){
                cookie = cookies[i];
                break;
              }
            }
        }
      %>
<html>
<head>
    <title></title>
</head>
<body>
<%--Выводим куки--%>
    <% if(cookie != null){ %>
        value: <%= cookie.getValue() %>
    <% } else { %>
        Cookies not found!!!
    <% } %>
</body>
</html>
