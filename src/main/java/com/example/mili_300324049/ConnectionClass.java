package com.example.mili_300324049;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
    public java.sql.Connection connect() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        java.sql.Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/loan", "root", "");

        return con1;

    }
}