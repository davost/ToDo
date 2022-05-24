package se.lexicon.dao.impl;

import se.lexicon.Model.Person;
import se.lexicon.dao.PersonDAO;
import se.lexicon.dao.sequencer.PersonIdSequencer;

import java.util.ArrayList;
import java.util.List;

public class PersonDAOCollection implements PersonDAO {

   private List<Person> people;

    public PersonDAOCollection() {people = new ArrayList<>();}

    //unable to use right click generate "implement methods"...OK, now it works :/

    @Override
    public Person persist(Person person) {
        //I see you implemented som "not null" code. I didn't see that in the instructions,
        //but I will do the same
        if (person == null) throw new IllegalArgumentException("Person null.");
        if (findByEmail(person.getEmail()) != null)
            throw new IllegalArgumentException("Email is in use!");
        person.setId(PersonIdSequencer.nextId());
        people.add(person);
        return person;
    }

    @Override
    public Person findByID(int id) {
        if (id == 0) throw new IllegalArgumentException("The id is zero.");
        for (Person element : people) {
            if (element.getId() == id) {
                return element;
            }
        }
        return null;
    }

    @Override
    public Person findByEmail(String email) {
        if (email == null) throw new IllegalArgumentException("Email is null");
        for (Person element : people) {
            if(element.getEmail().equals(email)) {
                return element;
            }
        }
            return null;
    }

    @Override
    public List<Person> findAll() {
        return people;
    }
    /*
    @Override
    public void remove(int id) {
        PersonDAO person = findByID(id);
        if (findByID(int) != 0) { person.

    }*/
}
