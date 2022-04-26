package se.lexicon;

import java.time.LocalDate;

public class TodoItem {

    private int id;
    private String title = "Write story.";
    private String description;
    private LocalDate deadline = LocalDate.now().plus(7);
    private boolean isDone;
    private Person creator;
    private LocalDate today = LocalDate.now();

    public boolean isOverdue() {
        if (this.today.isAfter(this.deadline))
            return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
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

    public LocalDate getToday() {
        return today;
    }

    public void setToday(LocalDate today) {
        this.today = today;
    }
}
