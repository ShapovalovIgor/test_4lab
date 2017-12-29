package ru.shapovalov.Beans;

import ru.shapovalov.Class.DataBaseConection.Checking.CheckingLogin;
import ru.shapovalov.Beans.NewUser.RegistrationServlet;

import javax.ejb.Stateless;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by igor on 18.03.15.
 */

@Stateless
@WebServlet("/loginServlet")
public class LoginServlet extends DispatcherServlet{

    String loginUser;
    String passwordUser;
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
// Call the method "checking" which checks the password with the password from the database and returns the access level
// And then go to the page with the appropriate access
                         switch (CheckingLogin.getInstance().checkingAccessLevel(loginUser = request.getParameter("login"),
                                 passwordUser = RegistrationServlet.encryptPassword(request.getParameter("password")),
                                 request))
                            {
                                case 0:
                                    super.forward("/login/loginError.jsp", request, response);
                                    break;
                                case 1:
                                    super.forward("/startPage/startUserPage.jsp", request, response);
                                    break;
                                case 2:
                                    super.forward("/startPage/startPrivilegedUserPage.jsp", request, response);
                                    break;
                                case 3:
                                    super.forward("/startPage/startAdminPage.jsp", request, response);
                                    break;
                                default:
                                    super.forward("/startPage/startUserPage.jsp", request, response);
                                    break;
                            }

    }
}
