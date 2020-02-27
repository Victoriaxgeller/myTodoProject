package database;

import todo.TodoModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TodoDataBaseMethods extends DataBaseConnection {


    public List<TodoModel> getUserTodos(int userId) {
        List<TodoModel> todoModels = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = createConnection()
                    .prepareStatement("SELECT todo_title, category FROM todo " +
                            "WHERE user_id =?");

            preparedStatement.setInt(1, userId);
            ResultSet resultSet = preparedStatement.executeQuery();
            int rowSize = 0;
            if (resultSet.next()) {
                rowSize = resultSet.getRow();
            }
            while (resultSet.next()) {
                for (int i = 0; i < rowSize; i++) {
                    todoModels.add(0, new TodoModel(
                            resultSet.getString("todo_title"),
                            resultSet.getString("category")));
                }
            }
            resultSet.first();
            todoModels.add(0, new TodoModel(
                    resultSet.getString("todo_title"),
                    resultSet.getString("category")));

            return todoModels;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return todoModels;
    }

    public void addUserTodos(int userId, TodoModel todoModel) {
        try {
            PreparedStatement preparedStatement = createConnection()
                    .prepareStatement("INSERT INTO todo (todo_title, user_id, category)" +
                            " VALUES (?,?,?)");
            preparedStatement.setString(1, todoModel.getName());
            preparedStatement.setInt(2, userId);
            preparedStatement.setString(3, todoModel.getCategory());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


