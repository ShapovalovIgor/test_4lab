package ru.shapovalov.Beans.Edit;

import ru.shapovalov.Beans.edit.EditAccount;
import ru.shapovalov.Beans.entity.Account;
import ru.shapovalov.Beans.DispatcherServlet;

import javax.ejb.Stateless;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by igor on 01.04.15.
 */

@Stateless
@WebServlet("/editAndViewAccessUserErrorServlet")
    public class EditAndViewAccessUserErrorServlet extends DispatcherServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int search = 0;
        Account accessLevel = null;
        List<Account> accessLevelList = new ArrayList<Account>();
        if(request.getParameter("search") != null) {
            search = Integer.parseInt(request.getParameter("search"));
            accessLevelList = EditAccount.getInstance().getSearch(search);
        }
        request.setAttribute("search", search);
        request.setAttribute("accessLevelList", accessLevelList);
        super.forward("/edit/editAndViewAccessUserError.jsp", request, response);
    }
}
