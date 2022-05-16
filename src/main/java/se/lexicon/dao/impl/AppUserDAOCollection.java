package se.lexicon.dao.impl;

import se.lexicon.Model.AppUser;
import se.lexicon.dao.AppUserDAO;

import java.util.ArrayList;
import java.util.List;

public class AppUserDAOCollection implements AppUserDAO {
    //private List<AppUser> appUserStorage = new ArrayList<>();
    private List<AppUser> appUsers;

    public AppUserDAOCollection() {
        appUsers = new ArrayList<>();
    }

    @Override
    public AppUser persist(AppUser appUser) {
        if (appUser == null) throw new IllegalArgumentException("no user found");
        if (findByUsername(appUser.getUsername()) != null)
            throw new IllegalArgumentException("Username" + appUser.getUsername() + " is already taken");
        appUsers.add(appUser);
        return null;
    }

    @Override
    public AppUser findByUsername(String username) {
        for (AppUser element: appUsers) {
            if (element.getUsername().equalsIgnoreCase(username)){
                return  element;
            }
        }
        return null;
    }

    @Override
    public List<AppUser> findAll() {return appUsers;}

    @Override
    public void remove(String username) {
        AppUser findUser = findByUsername(username);
        if (findUser != null) {appUsers.remove(findUser);}
    }
}
