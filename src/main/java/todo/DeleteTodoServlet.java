package todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/delete/todo")
public class DeleteTodoServlet extends HttpServlet {
    private TodoService todoService = new TodoService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        try {
            todoService.deleteTodoFromDataBase(Integer.parseInt(request.getParameter("user_id")),
                    new TodoModel(request.getParameter("todo"), request.getParameter("category"),
                            Integer.parseInt(request.getParameter("todo_id"))));
        } catch (SQLException e) {
            System.out.println("fghjgfdsdfghjgfdsadfghj");
        }
        response.sendRedirect("/list/todo");
    }
}
