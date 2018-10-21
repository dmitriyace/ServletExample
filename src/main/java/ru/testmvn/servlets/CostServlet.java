package ru.testmvn.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CostServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String kmStr = req.getParameter("km");
        String kgStr = req.getParameter("kg");

        int km = Integer.parseInt(kmStr);
        double kg = Double.parseDouble(kgStr);
        CostCalculator costCalculator = new CostCalculator(25,6);

        double cost = costCalculator.calcCost(kg,km);

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("<h1>Cost:</h1>");
        printWriter.write("<b>"+cost+"</b>");

    }
}
