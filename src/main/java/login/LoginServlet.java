package login;

import database.DataBaseConnection;
import database.DataBaseMethods;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    private UserValidationService userValidationService = new UserValidationService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        request.setAttribute("welcomeText", "Hello, please, enter your data...");
        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(
                request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,
            ServletException {
        String name = request.getParameter("username");
        String password = request.getParameter("userpassword");

        if (userValidationService.isUserValid(name, password)) {
            request.getSession().setAttribute("username", name);
            request.setAttribute("session", "true");
            response.sendRedirect("/list/todo");


        } else {
            request.setAttribute("session", "false");
            request.setAttribute("errorMessage", "Oops, your login or password is wrong..");
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(
                    request, response);
            PrintWriter writer = response.getWriter();
        }
    }
}
