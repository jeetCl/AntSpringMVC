package com.mkyong.controller;

import java.sql.*;
import javax.servlet.http.HttpServletRequest;

public class UserController {

    public void vulnerableSql(HttpServletRequest request) throws Exception {
        String userId = request.getParameter("id"); // unsafe input
        Connection conn = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");
        Statement stmt = conn.createStatement();

        // Vulnerable: concatenating user input directly
        String sql = "SELECT * FROM users WHERE id='" + userId + "'";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            System.out.println("User: " + rs.getString("name"));
        }

        rs.close();
        stmt.close();
        conn.close();
    }
}

