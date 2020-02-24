package login;

import database.LoginDataBaseMethods;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    LoginDataBaseMethods dataBaseMethods = new
            LoginDataBaseMethods();

    private UserValidationService userValidationService = new UserValidationService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(
                request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,
            ServletException {
        String name = request.getParameter("username");
        String password = request.getParameter("userpassword");

        if (!userValidationService.isUserRegistered(name, password)) {
            request.setAttribute("session", "false");
            request.setAttribute("errorMessage", "Oops, your login or password is wrong..");
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(
                    request, response);
            PrintWriter writer = response.getWriter();
        } else {
            request.getSession().setAttribute("username", name);
            request.getSession().setAttribute("user_id", dataBaseMethods.userExists(name, password));
            request.setAttribute("session", "true");
            response.sendRedirect("/list/todo");
        }
    }
}
