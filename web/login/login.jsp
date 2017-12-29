<%--
  Created by IntelliJ IDEA.
  User: igor
  Date: 18.03.15
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Login</title>
</head>
<body>
<form align="center" action="startServlet" method="POST">
  <br/>
  <br/>
  &nbsp; &nbsp; &nbsp;
  Login: <input type="text" name="login" placeholder="Enter your Login"/> <br />
  Password: <input type="password" name="password" placeholder="Enter your Password"/> <br />
  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
  <input type="submit" name="enter" value="Login In"/>
  <input type="submit" name="register" value="Registration"/>

</form>
</body>
</html>
