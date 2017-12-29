package ru.shapovalov.Beans.NewUser;

import ru.shapovalov.Class.DataBaseConection.Create.CreateUser;
import ru.shapovalov.Beans.DispatcherServlet;

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
@WebServlet("/addUserServlet")
public class AddUserServlet extends DispatcherServlet{

    String loginUser;
    String passwordUser;
    String firstNameUser;
    String lastNameUser;
    String middleName;
    int personnelNumber;
    String email;
    long phoneNumber;
    int access;
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
                loginUser = request.getParameter("login");
                passwordUser = RegistrationServlet.encryptPassword(request.getParameter("password"));
                firstNameUser = request.getParameter("firstName");
                lastNameUser = request.getParameter("lastName");
                middleName = request.getParameter("middleName");
                personnelNumber = Integer.parseInt(request.getParameter("personnelNumber"));
                email = request.getParameter("email");
                phoneNumber = Long.parseLong(request.getParameter("phoneNumber"));
                access = Integer.parseInt(request.getParameter("access"));

//            Obtain the data for the new user and register a new account using the method of "registrationUser"
        if(CreateUser.getInstance().registrationUser(response, request, personnelNumber, firstNameUser, lastNameUser,
                middleName, loginUser, passwordUser, email, phoneNumber, access) == true) {
            super.forward("/registration/addUserOk.jsp", request, response);
        } else {
            super.forward("/registration/addUserError.jsp", request, response);
        }

    }
}
