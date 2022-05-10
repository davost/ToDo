package se.lexicon.Model;

//import com.sun.xml.internal.ws.developer.MemberSubmissionAddressing;

import se.lexicon.util.Validation;

import java.util.Objects;

public class AppUser {
    private String username;
    private String password;
    private AppRoll role;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        //if (username == null) throw new IllegalArgumentException("Username must not be null");
        Validation.checkStringNotNull.andThen(Validation.checkNotEmpty).accept(username, "Username");
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
       // if (password == null) throw new IllegalArgumentException("Password must not be null.");
       Validation.checkStringNotNull.andThen(Validation.checkNotEmpty).andThen(Validation.checkMinLength3).accept(password, "Password");
        this.password = password;
    }

    public AppRoll getRole() {
        return role;
    }

    public void setRole(AppRoll role) {
        if (role == null) throw new IllegalArgumentException("Roll must not be null.");
        this.role = role;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return username == appUser.username && Objects.equals(role, appUser.role);
    }


    @Override
    public int hashCode() {
        return Objects.hash(username, password, role);
    }


    @Override
    public String toString() {
        return "AppUser{" +
                "username='" + username + '\'' +
                ", role=" + role +
                '}';
    }

}
