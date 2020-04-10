/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DatabaseConnection {

    private static String dbUrl = "jdbc:mysql://localhost:3306/stockmanagementsystem";
    private static String dbUsername = "root";
    private static String dbPass = "";

    public static Statement getStatement() throws SQLException {
        Connection connection = DriverManager.getConnection(
                dbUrl, dbUsername, dbPass
        );
        Statement statement = connection.createStatement();
        return statement;
    }

    public ResultSet pullAllData() throws Exception {
        String sql = "select qty from updatestock";
        ResultSet rs = null;
        rs = getStatement().executeQuery(sql);
        return rs;
    }
}
