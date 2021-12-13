/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Quang
 */
public class DBContext {

    protected Connection connection;

    public DBContext() {
        try {
            String user = "se1514";
            String pass = "12345678";
            String url = "jdbc:sqlserver://QUANG-COMPUTER\\SQLEXPRESS:1433;databaseName=QuickBooking";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        DBContext dBContext = new DBContext();
        if (dBContext.connection != null) {
            System.out.println("Successful");
        } else {
            System.out.println("Fail");
        }
    }
}
