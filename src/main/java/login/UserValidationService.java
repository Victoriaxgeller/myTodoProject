package login;

public class UserValidationService {

    public boolean isUserValid(String userName, String password) {
        if (userName.equals("viktoriia") && password.equals("123")) {
            return true;
        } else {
            return false;
        }
    }
}
