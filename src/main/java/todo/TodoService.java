package todo;

import database.TodoDataBaseMethods;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TodoService {
    TodoDataBaseMethods todoDataBaseMethods = new TodoDataBaseMethods();
    private static List<TodoModel> todos = new ArrayList<>();

    public List<TodoModel> getTodosFromDataBase(int userId) {
        todos = todoDataBaseMethods.getUserTodos(userId);
        for (TodoModel i : todos) {
            System.out.println(i);
        }
        return todos;
    }

    public List<TodoModel> addTodosToDataBase(int userId, String title, String category) {
        todoDataBaseMethods.addUserTodos(userId, new TodoModel(title, category));
        return getTodosFromDataBase(userId);
    }

    public List<TodoModel> deleteTodoFromDataBase(int userId, TodoModel todo) throws SQLException {
        todoDataBaseMethods.deleteTodos(userId, todo);
        return getTodosFromDataBase(userId);
    }

    public void deleteTodo(TodoModel todo) {
        todos.remove(todo);
    }
}


