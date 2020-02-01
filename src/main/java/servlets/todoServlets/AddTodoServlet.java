package servlets.todoServlets;

import models.TodoModel;
import services.TodoService;

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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String newTodo = request.getParameter("todo");
        if(!newTodo.isEmpty()) {
            todoService.addTodo(new TodoModel(newTodo));
        }
        else {
        }

       response.sendRedirect("/list/todo");
    }
}
