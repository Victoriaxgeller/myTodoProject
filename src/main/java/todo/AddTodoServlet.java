package todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/add/todo")
public class AddTodoServlet extends HttpServlet {
    private TodoService todoService = new TodoService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/views/add-todos.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String newTodo = request.getParameter("todo");
        String category = request.getParameter("category");
        if (!newTodo.isEmpty()) {
            todoService.addTodosToDataBase((Integer) request.getSession().getAttribute("user_id"), newTodo, category);
        } else {
        }

        response.sendRedirect("/list/todo");
    }
}
