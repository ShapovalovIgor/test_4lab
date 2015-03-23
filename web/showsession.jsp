<%--
  Created by IntelliJ IDEA.
  User: igor
  Date: 19.03.15
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

      <%
        String value = (String) session.getAttribute("inputtext");
      %>
<html>
<head>
    <title></title>
</head>
<body>
      Session:  <font color="green"><%= value%></font>
</body>
</html>
