package ru.shapovalov.Beans.Edit;

import ru.shapovalov.Class.DataBaseConection.Edit.EditAccessUser;
import ru.shapovalov.Beans.DispatcherServlet;

import javax.ejb.EJB;
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
@WebServlet("/applyEditAccessUserServlet")
public class ApplyEditAccessUserServlet extends DispatcherServlet{

    @EJB
    EditAccessUser editAccessUser;

    int id;
    int access;
//    Write data into the database after editing
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
                id = Integer.parseInt(request.getParameter("id"));
                access = Integer.parseInt(request.getParameter("access"));

        if(editAccessUser.editAccess(response, request, id, access) == true) {
            super.forward("/edit/editAccessUserOk.jsp", request, response);
        } else {
            super.forward("/edit/editAccessUserError.jsp", request, response);
        }

    }
}
