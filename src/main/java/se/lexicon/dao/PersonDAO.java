package se.lexicon.dao;

import se.lexicon.Model.Person;

import java.util.List;

public interface PersonDAO {
    // define the abstract methods
    Person persist(Person person);
    Person findByID(int id);
    Person findByEmail(String email);
    List<Person> findAll();
    void remove(Person person);
}
