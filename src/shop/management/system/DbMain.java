/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop.management.system;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DbMain {
     public static void main(String[] args) throws SQLException {

        Connection conn = DatabaseConnection.getConnection();
//        DatabaseMetaData d = conn.getMetaData();
        Statement stmt = conn.createStatement();
                
    }
}
