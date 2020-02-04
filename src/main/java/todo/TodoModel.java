package todo;

import java.util.Objects;

public class TodoModel {


    private String name;
    private String category;

    public TodoModel(String name, String category) {
        super();
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
