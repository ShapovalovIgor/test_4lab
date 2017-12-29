<%--
  Created by IntelliJ IDEA.
  User: igor
  Date: 18.03.15
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
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
      <form align="center" action="registrationServlet" method="POST">
        Login: <input required="on" type="text" maxlength="20" name="login" placeholder="Enter your Login" autocomplete="on"/> <br/>
        Password: <input required="on" type="password" maxlength="25" name="password" placeholder="Enter your password" autocomplete="on"/> <br/>
          First name: <input required="on" type="text" maxlength="20" name="firstName" placeholder="Enter your First name" autocomplete="on"/> <br/>
        Last name: <input required="on" type="text" maxlength="25" name="lastName" placeholder="Enter your Last name" autocomplete="on"/> <br/>
        Middle name: <input required="on" type="text" maxlength="25" name="middleName" placeholder="Enter your Middle name" autocomplete="on"/> <br/>
        Personnel number: <input required="on" type="number" min="0000" max="9999" maxlength="4" placeholder="persNum" name="personnelNumber" autocomplete="on"/> <br/>
        Email: <input required="on" type="email" maxlength="30" name="email" placeholder="Enter your Email" autocomplete="on" size="30"/> <br/>
        Phone number: +7<input required="on" type="number" min="0000000000" max="9999999999" maxlength="10" placeholder="0123456789" name="phoneNumber" autocomplete="on"/> <br/>
        <tr>
          <td>
            <label>Я ознакомился с положениями<br />
              пользовательского соглашения &nbsp;&nbsp;&nbsp;<input required="on" type="checkbox" class="checkbox"><br />
              и согласен с ними
            </label><br>
          </td>
          </tr>
          </br>
        <%@include file="licenseAgreement.jsp"%>
        </br>
        <input type="submit" name="register" value="Registration" />
      </form>
</body>
</html>
