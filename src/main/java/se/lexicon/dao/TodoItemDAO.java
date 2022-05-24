package se.lexicon.dao;

import se.lexicon.Model.TodoItem;

import java.time.LocalDate;
import java.util.List;

public interface TodoItemDAO {

    TodoItem persist(TodoItem todoItem);

    TodoItem findById(int id);

    List<TodoItem> findAll();

    List<TodoItem> findAllByDoneStatus(boolean isDone);

    List<TodoItem> findByTitleContains(String title);

    List<TodoItem> findByPersonId(int personId);

    List<TodoItem> findByDeadlineBefore(LocalDate date);

    List<TodoItem> findByDeadlineAfter(LocalDate date);

    void remove(int id);


}
