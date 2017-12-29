package ru.shapovalov.Beans.View;

import ru.shapovalov.Beans.edit.EditAccount;
import ru.shapovalov.Beans.entity.Account;
import ru.shapovalov.Beans.DispatcherServlet;

import javax.ejb.Stateless;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by igor on 01.04.15.
 */

@Stateless
@WebServlet("/viewEditUserServlet")
    public class ViewEditUserServlet extends DispatcherServlet {
//Fill the data of the selected user in the "editAndViewUser" in the edit form by "editUser"
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Account account = null;
        if(request.getParameter("select") != null) {
           account = EditAccount.getInstance().getId(Integer.parseInt(request.getParameter("select")));
        } else {
            super.forward("/editAndViewUserErrorServlet", request, response);
        }
        request.setAttribute("account", account);
                super.forward("/edit/editUser.jsp", request, response);
    }
}
