package com.example.exercices1_produitjee.service;

import com.example.exercices1_produitjee.dao.Repository;
import com.example.exercices1_produitjee.model.User;

import java.util.List;

public class UserService extends BaseService implements Repository<User> {

    public UserService(){
        super();
    }

    @Override
    public boolean create(User u) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(u);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(User u) {
        return false;
    }

    @Override
    public boolean delete(User u) {
        return false;
    }

    @Override
    public User findById(int id) {
        session = sessionFactory.openSession();
        User u = session.get(User.class, id);
        session.close();
        return u;
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
