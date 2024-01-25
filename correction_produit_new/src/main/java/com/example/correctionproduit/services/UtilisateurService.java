package com.example.correctionproduit.services;

import com.example.correctionproduit.entities.Utilisateur;
import com.example.correctionproduit.interfaces.Repository;

import java.util.List;

public class UtilisateurService extends BaseService implements Repository<Utilisateur> {

    @Override
    public boolean create(Utilisateur u) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(u);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Utilisateur u) {
        return false;
    }

    @Override
    public boolean delete(Utilisateur u) {
        return false;
    }

    @Override
    public Utilisateur findById(int id) {
        Utilisateur utilisateur = null;
        session = sessionFactory.openSession();
        utilisateur = (Utilisateur) session.get(Utilisateur.class, id);
        session.close();
        return utilisateur;
    }

    @Override
    public List<Utilisateur> findAll() {
        return null;
    }
}
