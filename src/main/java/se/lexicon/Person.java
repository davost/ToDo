package se.lexicon;

public class Person {

    private int id;
    private String firstName, lastName, email;

    public Person() {

    }

    //public void getSummary(int, String, String, String) {
    //    //System.out.println(this.id + this.firstName + this.lastName + this.email);
    //    return this.id, this.firstName, this.lastName, this.email;
    }

    //public void getSummary() {
    //   System.out.println(id + firstName + lastName +email);
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
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
