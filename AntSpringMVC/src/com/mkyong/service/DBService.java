package com.mkyong.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBService {

    public Connection getConnection() throws Exception {
        // Vulnerable: hardcoded credentials
        String username = "admin";
        String password = "admin123";
        return DriverManager.getConnection("jdbc:h2:mem:testdb", username, password);
    }
}

