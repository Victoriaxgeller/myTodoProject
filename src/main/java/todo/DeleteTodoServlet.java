package todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/delete/todo")
public class DeleteTodoServlet extends HttpServlet {
    private TodoService todoService = new TodoService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        todoService.deleteTodo(new TodoModel(request.getParameter("todo"), request.getParameter("category")));

        response.sendRedirect("/list/todo");

    }
}