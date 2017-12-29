package ru.shapovalov.Beans.Edit;

import ru.shapovalov.Class.DataBaseConection.Edit.EditUser;
import ru.shapovalov.Beans.DispatcherServlet;
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
@WebServlet("/applyEditUserServlet")
public class ApplyEditUserServlet extends DispatcherServlet{

    int id;
    String loginUser;
    String passwordUser;
    String firstNameUser;
    String lastNameUser;
    String middleName;
    int personnelNumber;
    String email;
    long phoneNumber;
//    Write data into the database after editing
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
                id = Integer.parseInt(request.getParameter("id"));
                loginUser = request.getParameter("login");
                passwordUser = RegistrationServlet.encryptPassword(request.getParameter("password"));
                firstNameUser = request.getParameter("firstName");
                lastNameUser = request.getParameter("lastName");
                middleName = request.getParameter("middleName");
                personnelNumber = Integer.parseInt(request.getParameter("personnelNumber"));
                email = request.getParameter("email");
                phoneNumber = Long.parseLong(request.getParameter("phoneNumber"));

        if(EditUser.getInstance().registrationUser(response, request, id, personnelNumber, firstNameUser, lastNameUser,
                middleName, loginUser, passwordUser, email, phoneNumber) == true) {
            super.forward("/edit/editUserOk.jsp", request, response);
        } else {
            super.forward("/edit/editUserError.jsp", request, response);
        }

    }
}
