package com.example.correctionproduit.services;

import com.example.correctionproduit.entities.Utilisateur;
import com.example.correctionproduit.interfaces.Repository;

import java.util.List;

public class UtilisateurService extends BaseService implements Repository<Utilisateur> {

    @Override
    public boolean create(Utilisateur u) {
        return false;
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
        return null;
    }

    @Override
    public List<Utilisateur> findAll() {
        return null;
    }
}
