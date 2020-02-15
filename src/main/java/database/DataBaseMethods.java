package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DataBaseMethods extends DataBaseQueries {

    public void getDataFromUsers() throws SQLException {
        ResultSet result = performQuery("Select * from user");
        while (result.next()) {
            System.out.print(result.getString("username"));
            System.out.print(result.getString("user_id"));
            System.out.print(result.getString("todo_id"));
        }
    }

    public void addUser(String name, String password) throws SQLException {
        PreparedStatement pstm = connection.prepareStatement("insert into" +
                " login (name, password) values (?,?)");
        pstm.setString(1, name);
        pstm.setString(2, password);
        pstm.execute();
    }
}