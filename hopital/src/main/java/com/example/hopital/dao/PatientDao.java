package com.example.hopital.dao;

import com.example.hopital.entities.Patient;


import java.util.List;
import org.hibernate.query.Query;

public class PatientDao extends BaseDao<Patient>{

    public PatientDao(){
        super();
    }

    public Patient findPatientById(Long id){
        Patient patient = null;
        session = sessionFactory.openSession();
        patient = session.get(Patient.class, id);
        session.close();
        return patient;
    }

    public List<Patient> findPatientByName(String name) {
        List<Patient> results = null;
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            Query<Patient> patientQuery = session.createQuery("from Patient where lastname like :name");
            patientQuery.setParameter("name", "%" + name + "%");
            results = patientQuery.list();
            session.getTransaction().commit();
        } catch (Exception e) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return results;
    }

}
