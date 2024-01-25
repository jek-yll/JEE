package com.example.hopital.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

public abstract class BaseDao<T> {
    protected StandardServiceRegistry registry;
    protected SessionFactory sessionFactory;
    protected Session session;
    public BaseDao() {
        registry = new StandardServiceRegistryBuilder().configure().build();
        sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
    }

    public boolean createOrUpdate(T element){
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.saveOrUpdate(element);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    public boolean delete(T o){
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.detach(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    public T findById(int id){
        return null;
    }

    public List<T> findAll(){ return null; };

}
