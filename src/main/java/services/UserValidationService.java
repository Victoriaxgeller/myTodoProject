package services;

public class UserValidationService {

    public boolean isUserValid(String userName, String password) {
        if (userName.equals("viktoriia") && password.equals("123abc")) {
            return true;
        } else {
            return false;
        }
    }
}
