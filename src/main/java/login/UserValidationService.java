package login;

import database.LoginDataBaseMethods;

import java.sql.SQLException;

public class UserValidationService {
    LoginDataBaseMethods loginDataBaseMethods = new
            LoginDataBaseMethods();

    public boolean isNameAvailable(String userName) {
        try {
            return loginDataBaseMethods.userNameExists(userName) == 0 ? true : false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isUserRegistered(String name, String pass) {
        return loginDataBaseMethods.userExists(name, pass) > 0 ? true : false;
    }
}
