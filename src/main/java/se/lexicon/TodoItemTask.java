package se.lexicon;

public class TodoItemTask {

    private int id;
    private Person assignee = new Person();
    private boolean assigned;
    TodoItem toDo = new TodoItem();

    public TodoItemTask() {
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
        this.toDo = toDo;
    }
}
