package se.lexicon.dao.impl;

import se.lexicon.Model.Person;
import se.lexicon.Model.TodoItem;
import se.lexicon.dao.TodoItemDAO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ToDoitemDAOCollection implements TodoItemDAO {

    private List<TodoItem> todoItems;

    public ToDoitemDAOCollection() {
        todoItems = new ArrayList<>();
    }

    @Override
    public TodoItem persist(TodoItem todoItem) {
        if (todoItem == null) throw new IllegalArgumentException("No task found.");
        todoItem.setId(todoItem.getId());
        return null;
    }

    @Override
    public TodoItem findById(int id) {
        if (id == 0) throw new IllegalArgumentException("The id is zero.");
        for (TodoItem element : todoItems) {
            if (element.getId() == id) {
                return element;
            }
        }
        return null;
    }

    @Override
    public List<TodoItem> findAll() {
        return todoItems;
    }

    @Override
    public List<TodoItem> findAllByDoneStatus(boolean isDone) {
        if (isDone) {
            System.out.println("Task is done.");
        } else {
            System.out.println("Task is not done.");
        }
     }

     /*
    @Override //?????????????????????
    public List<TodoItem> findByTitleContains(String title) {
        if (title == null)  throw new IllegalArgumentException("Title is null");
        for (TodoItem element : todoItems) {
            if (element.getTitle().equals(title)) {
                return element;
            }
        }
        return null;
    }*/
    /*
    @Override
    public List<TodoItem> findByPersonId(int personId) {
        if (personId == 0) throw new IllegalArgumentException("The person id is zero.");
        for (TodoItem element : todoItems) {
            if (element.getId() == personId) {
                return element;
        return null;
    }*/

    @Override
    public List<TodoItem> findByDeadlineBefore(LocalDate date) {
        return null;
    }

    @Override
    public List<TodoItem> findByDeadlineAfter(LocalDate date) {
        return null;
    }
    /*
    @Override
    public void remove(int id) {

    }*/
}
