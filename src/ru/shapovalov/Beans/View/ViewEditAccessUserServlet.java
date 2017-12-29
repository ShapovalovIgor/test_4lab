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
@WebServlet("/viewEditAccessUserServlet")
    public class ViewEditAccessUserServlet extends DispatcherServlet {
//Fill the data of the selected user in the "editAndAccessViewUser.jsp" in the edit form by "editAccessUser.jsp"
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Account accessLevel = null;
        if(request.getParameter("select") != null) {
           accessLevel = EditAccount.getInstance().getId(Integer.parseInt(request.getParameter("select")));
        } else {
            super.forward("/editAndViewAccessUserErrorServlet", request, response);
        }
        request.setAttribute("accessLevel", accessLevel);
                super.forward("/edit/editAccessUser.jsp", request, response);
    }
}
