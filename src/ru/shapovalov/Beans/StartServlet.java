package ru.shapovalov.Beans;

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
@WebServlet("/startServlet")
public class StartServlet extends DispatcherServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// Check what button is pressed "enter" or "register"
    if (request.getParameter("enter") != null)super.forward("/loginServlet", request, response);
    else if(request.getParameter("register") != null)super.forward("/registration/registration.jsp", request, response);
    }
}
