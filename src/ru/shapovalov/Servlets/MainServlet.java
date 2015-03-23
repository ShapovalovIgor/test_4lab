package ru.shapovalov.Servlets;


import ru.shapovalov.Connection.ConnectService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by igor on 20.03.15.
 */
public class MainServlet extends HttpServlet{

    private ConnectService connServ;

    @Override
    protected  void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {

        long id = Long.parseLong(req.getParameter("id"));
        String title =  connServ.getTitle(id);
        req.getSession().setAttribute("title",title);
        resp.sendRedirect("show.jsp");
    }

    @Override
    protected  void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doGet(req, resp);
    }
}
