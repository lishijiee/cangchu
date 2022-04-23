package com.lishijiee.controller;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String w = req.getParameter("w");
        String h = req.getParameter("h");
        String  str = name+ w + h + "";
        req.setAttribute("str", str);
        req.getRequestDispatcher("/result.html").forward(req, resp);
    }
}
