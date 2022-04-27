package se.lexicon.Model;

import java.util.Objects;

public class TodoItemTask {

    private int id;
    private Person assignee = new Person();
    private boolean assigned;
    TodoItem toDo = new TodoItem();

    //public  String getSummary() {
    //    return "{id: " + id + " assigned to " + assignee + " assigned? " + assigned + "}";
    //}


    public TodoItemTask() {
    }

    public TodoItemTask(int id, Person assignee, TodoItem toDo) {
        this.id = id;
        setAssignee(assignee);
        this.toDo = toDo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;

        if (this.assignee != null){
            setAssigned(true);
        } else {
            setAssigned(false);
        }
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public TodoItem getToDo() {
        return toDo;
    }

    public void setToDo(TodoItem toDo) {
        if (toDo == null) throw new IllegalArgumentException("TodoItem must not be null");
        this.toDo = toDo;
    }
    //Person.getSummary();
    //this.Person.getSummary();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItemTask that = (TodoItemTask) o;
        return id == that.id && assigned == that.assigned && toDo.equals(that.toDo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, assigned, toDo);
    }

    @Override
    public String toString() {
        return "TodoItemTask{" +
                "id=" + id +
                ", assigned=" + assigned +
                ", toDo=" + toDo +
                '}';
    }
}
