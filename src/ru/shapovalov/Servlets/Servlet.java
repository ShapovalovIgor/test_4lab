package ru.shapovalov.Servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by igor on 19.03.15.
 */
public class Servlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        HttpSession session = request.getSession();

        String str = request.getParameter("inputtext");

        session.setAttribute("inputtext", str);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/showsession.jsp");

        dispatcher.forward(request, response);
    }
}
