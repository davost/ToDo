package se.lexicon.Model;

import java.time.LocalDate;
import java.util.Objects;

public class TodoItem {

    private int id;
    private String title = "Write story.";
    private String description;
    private LocalDate deadline;
    private boolean isDone;
    private Person creator;

    public TodoItem() {
    }

    public TodoItem(int id, String title, String description, LocalDate deadline, boolean isDone, Person creator) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.isDone = isDone;
        this.creator = creator;
    }

    //public String getSummary() {
    //    return "{id: " + id + " title: " + title + " description " + description + " }";
    //}

    public boolean isOverdue() {
        if (LocalDate.now().isAfter(this.deadline))
            return true;
        else
            return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        if (title == null) throw new IllegalArgumentException("Title must not be null!");
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        if (deadline == null) throw new IllegalArgumentException("Deadline must not be null");
        this.deadline = deadline;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItem todoItem = (TodoItem) o;
        return id == todoItem.id && isDone == todoItem.isDone && title.equals(todoItem.title) && description.equals(todoItem.description) && deadline.equals(todoItem.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, deadline, isDone);
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", deadline=" + deadline +
                ", isDone=" + isDone +
                '}';
    }
}
