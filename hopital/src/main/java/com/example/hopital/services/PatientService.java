package com.example.hopital.services;

import com.example.hopital.dao.ConsultationDao;
import com.example.hopital.dao.PatientDao;
import com.example.hopital.entities.Patient;

import java.time.LocalDate;

public class PatientService {

    private PatientDao patientDao;

    public PatientService(){
        patientDao = new PatientDao();
    }

    public boolean addPatient(String firstname, String lastname, LocalDate date, byte[] photo){
        Patient patient = new Patient(firstname, lastname, date, photo);
        return patientDao.createOrUpdate(patient);
    }

}
