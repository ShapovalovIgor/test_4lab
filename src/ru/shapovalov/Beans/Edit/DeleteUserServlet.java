package ru.shapovalov.Beans.Edit;

import ru.shapovalov.Class.DataBaseConection.Edit.Delete;
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
@WebServlet("/deleteUserServlet")
public class DeleteUserServlet extends DispatcherServlet{

    int id;

//    Remove user from database
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
                id = Integer.parseInt(request.getParameter("id"));
        if(Delete.getInstance().deleteUser(response, request, id)== true) {
            super.forward("/editAndViewUserServlet", request, response);
        } else {
            super.forward("/editAndViewUserDeleteErrorServlet", request, response);
        }

    }
}
