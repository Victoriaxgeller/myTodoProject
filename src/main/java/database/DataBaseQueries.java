package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseQueries extends DataBaseConnection {
    Connection connection;

    public DataBaseQueries() {
        this.connection = createConnection();
    }

    public ResultSet performQuery(String q) throws SQLException {
        Connection connection = createConnection();
        return connection.createStatement().executeQuery(q);
    }
}