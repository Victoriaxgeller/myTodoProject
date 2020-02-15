package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DataBaseMethods extends DataBaseConnection {

    public void addUser(String name, String password) throws SQLException {
        PreparedStatement pstm = createConnection().prepareStatement("insert into" +
                " login (name, password) values (?,?)");
        pstm.setString(1, name);
        pstm.setString(2, password);
        pstm.execute();
    }

    public int userExists(String name, String password) throws SQLException {
        try {
            PreparedStatement preparedStatement = createConnection().prepareStatement("SELECT id FROM login " +
                    "WHERE name= ? AND password= ?");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt("id");
            }
            return 0;
        } catch (SQLException e) {
            throw e;
        }
    }

    public int userNameExists(String name) throws SQLException {
        try {
            PreparedStatement prsm = createConnection().prepareStatement("SELECT COUNT(id) " +
                    "FROM login " + "WHERE name = ?");

            prsm.setString(1, name);
            ResultSet resultSet = prsm.executeQuery();
            return resultSet.next() ? resultSet.getInt(1) : 0;

        } catch (SQLException e) {
            throw e;
        }
    }
}