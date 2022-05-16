package se.lexicon.dao;

import se.lexicon.Model.AppUser;

import java.util.List;

public interface AppUserDAO {
    // define all crud operations for AppUser
   AppUser persist(AppUser appUser);
   AppUser findByUsername(String username);

   List<AppUser> findAll();

   void remove(String username);

}
