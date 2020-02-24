package todo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

public class TodoModel {


    private String name;
    private String category;
    private int todo_id;
    private int user_id;

    public TodoModel(String name, String category) {
//        super();
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String category) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    private int getUserId(HttpServletRequest request) {
        return Integer.parseInt((String) request.getAttribute("user_id"));
    }

    public void setUserId(int userId) {
        this.user_id = userId;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format("Todo [name=%s]", name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TodoModel)) return false;
        TodoModel todoModel = (TodoModel) o;
        return name.equals(todoModel.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
