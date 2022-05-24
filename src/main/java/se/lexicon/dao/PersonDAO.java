package se.lexicon.dao;

import se.lexicon.Model.Person;

import java.util.Collection;

public interface PersonDAO {
    // define the abstract methods

    Person persist(Person person);

    Person findByID(int id);

    Person findByEmail(String email);

    //List<Person> findAll();
    Collection<Person> findAll();

    //void remove(Person person);
    void remove(int id);
}
