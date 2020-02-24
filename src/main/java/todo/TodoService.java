package todo;

import database.TodoDataBaseMethods;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
    TodoDataBaseMethods todoDataBaseMethods = new TodoDataBaseMethods();
    private static List<TodoModel> todos = new ArrayList<>();

//    static {
//        todos.add(new TodoModel("Learn Web application Development", "Study"));
//        todos.add(new TodoModel("Download and setup Database", "Study"));
//        todos.add(new TodoModel("Learn Spring MVC", "Study"));
//    }

//    static {
//        todos.add(new TodoModel("Learn Web application Development", "Study"));
//        todos.add(new TodoModel("Download and setup Database", "Study"));
//        todos.add(new TodoModel("Learn Spring MVC", "Study"));
//    }

    public List<TodoModel> getTodos() {
        return todos;
    }

    public List<TodoModel> getTodosFromDataBase(int userId) {
        todos = todoDataBaseMethods.getUserTodos(userId);
        return todos;
    }

    public List<TodoModel> addTodosToDataBase(int userId, String title, String category) {

        todoDataBaseMethods.addUserTodos(userId, new TodoModel(title, category));
        return getTodosFromDataBase(userId);
    }

    public void addTodo(TodoModel todo) {
        todos.add(todo);
    }

    public void deleteTodo(TodoModel todo) {
        todos.remove(todo);
    }
}


