package com.example.hopital.dao;

import com.example.hopital.entities.User;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class UserDao extends BaseDao<User>{

    public UserDao(){
        super();
    }

    public User getByUsernamePassword(User user){
        try {
            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            Query<User> query = session.createQuery("FROM User WHERE username = :username AND password = :password", User.class);

            query.setParameter("username", user.getUsername());
            query.setParameter("password", user.getPassword());

            User user1 = query.uniqueResult();
            transaction.commit();

            if (user1 != null){
                return user1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }


}
