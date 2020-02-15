package database;

import java.sql.*;

public class DataBaseConnection {

    public Connection createConnection() {
        Connection conn = null;
        String url = "jdbc:mysql://157.230.117.79:32637/jopula";
        String username = "jopula";
        String password = "XuHj=z&[B@d9w(5X";

        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection to Store DB succesfull!");

        } catch (Exception ex) {
            System.out.println("Connection failed!!!!!!1..." + ex.getStackTrace());
        }
        return conn;
    }
}
