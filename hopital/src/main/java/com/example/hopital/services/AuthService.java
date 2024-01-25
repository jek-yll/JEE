package com.example.hopital.services;

import com.example.hopital.dao.UserDao;
import com.example.hopital.entities.User;

public class AuthService {

    private UserDao userDao;

    public AuthService(){
        userDao = new UserDao();
    }

    public User getUserByUsernamePassword(String username, String password){
        User user = new User(username, password);
        return userDao.getByUsernamePassword(user);
    }

}
