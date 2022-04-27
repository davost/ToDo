package se.lexicon;

import se.lexicon.Model.Person;
import se.lexicon.Model.TodoItem;
import se.lexicon.Model.TodoItemTask;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Person taskCreator = new Person(2, "svebn", "svensson", "dd@ss.se");
        Person david = new Person(1,  "david", "öst ", "gg@gg.se");
        Person erik = new Person(3, "erik", "gustavsason ", "ss@dd.se");

        TodoItem task1 = new TodoItem(1, "Write schedule", "Appointments", LocalDate.parse("2022-04-28"), false, taskCreator);
        TodoItem task2 = new TodoItem(2, "Write code", "Exercises", LocalDate.parse("2022-04-29"), false, taskCreator);


        TodoItemTask todoItemTask1 = new TodoItemTask(1, david, task1);
        TodoItemTask todoItemTask2 = new TodoItemTask(2, erik, task2);

        System.out.println(todoItemTask1.isAssigned());
        //System.out.println(erik.getSummary());
        //System.out.println(david.getSummary().trim());
        //System.out.println(task1.getSummary());
        System.out.println(task2.toString());
        //david.toString();
        //task2.toString();

        System.out.println(task1.getTitle() + " " + "Is task overdue? " + task1.isOverdue() + ". Tasks to do: " + task1.getDescription());
        //System.out.println(todoItemTask1.getSummary()); //*************getting unwanted output "assigned to se.lexicon.Model.Person@5e9f23b4"

    }
}
