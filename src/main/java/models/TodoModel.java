package models;

import java.util.Objects;

public class TodoModel {


    private String name;

    public TodoModel(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
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
