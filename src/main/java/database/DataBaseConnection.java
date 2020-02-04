package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

    public static void createConnection() {
        try {
            String url = "jdbc:mysql://157.230.117.79:32557/jopula";
            String username = "jopula";
            String password = "XuHj=z&[B@d9w(5X";
            Class.forName("com.mysql.jdbc.Driver");

//            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {
                System.out.println("Connection to Store DB succesfull!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (
                Exception ex) {
            System.out.println("Connection failed...");

            System.out.println(ex);
        }
    }
}
