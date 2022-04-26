package se.lexicon;

public class Person {

    private int id;
    private String firstName, lastName, email;

    public Person() {
    }

    public Person(int id, String firstName, String lastName, String email) {
        this.id = id;
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }

    //public void getSummary(this.Person) {
    //    return Person;
    //}

    public String getSummary() {
        return " {id: "+ id +"," + "name: " + firstName + " " + lastName + "email: " + email + "}";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) throw new IllegalArgumentException("First name must not be null");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) throw new IllegalArgumentException("Last name must not be null");
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null) throw new IllegalArgumentException("Email must not be null");
        this.email = email;
    }
//public void getSummary(int, String, String, String) {
    //    //System.out.println(this.id + this.firstName + this.lastName + this.email);
    //    return this.id, this.firstName, this.lastName, this.email;
    }

    //public void getSummary() {
    //   System.out.println(id + firstName + lastName +email);
//}




