package login;

import database.LoginDataBaseMethods;
import todo.TodoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/registration")

public class RegistrationServlet extends HttpServlet {
    private UserValidationService userValidationService = new UserValidationService();
    private TodoService todoService = new TodoService();
    private LoginDataBaseMethods dataBase = new LoginDataBaseMethods();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        request.getRequestDispatcher("/WEB-INF/views/registration.jsp").forward(
                request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("username");
        String password = request.getParameter("userpassword");
        if (name.isEmpty() || password.isEmpty()) {
            request.setAttribute("errorMessage", "Sorry, you have to enter your name and password to register new account...");

            request.getRequestDispatcher("/WEB-INF/views/registration.jsp").forward(
                    request, response);
        } else {
            if (userValidationService.isNameAvailable(name)) {
                try {
                    int user_id = dataBase.addUser(name, password);
                    request.getSession().setAttribute("username", name);
                    request.getSession().setAttribute("user_id", user_id);
                    request.setAttribute("session", "true");
                    response.sendRedirect("/list/todo");
                } catch (SQLException e) {
                    System.out.println("User not registered..");
                }
            } else {
                request.setAttribute("errorMessage", "Sorry, this name is already taken...");
                request.getRequestDispatcher("/WEB-INF/views/registration.jsp").forward(
                        request, response);
            }
        }
    }
}