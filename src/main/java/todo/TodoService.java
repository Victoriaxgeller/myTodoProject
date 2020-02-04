package todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
    private static List<TodoModel> todos = new ArrayList<>();

    static {
        todos.add(new TodoModel("Learn Web application Development", "Study"));
        todos.add(new TodoModel("Download and setup Database", "Study"));
        todos.add(new TodoModel("Learn Spring MVC", "Study"));
    }

    public List<TodoModel> getTodos() {
        return todos;
    }

    public void addTodo(TodoModel todo) {
        todos.add(todo);
    }

    public void deleteTodo(TodoModel todo) {
        todos.remove(todo);
    }
}

