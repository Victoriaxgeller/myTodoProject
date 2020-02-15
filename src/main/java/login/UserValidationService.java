package login;

import database.DataBaseMethods;

import java.sql.SQLException;

public class UserValidationService {
    DataBaseMethods dataBaseMethods = new
            DataBaseMethods();

    public boolean isNameAvailable(String userName) {
        try {
            return dataBaseMethods.userNameExists(userName) == 0 ? true : false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isUserRegistered(String name, String pass) {
        try {
            return dataBaseMethods.userExists(name, pass) > 0 ? true : false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
