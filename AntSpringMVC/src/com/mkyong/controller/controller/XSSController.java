package com.mkyong.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class XSSController {

    public void vulnerableXSS(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String name = request.getParameter("name"); // unsafe input
        PrintWriter out = response.getWriter();

        // Vulnerable: output user input directly to page
        out.println("<h1>Hello " + name + "</h1>");
    }
}

