package com.example.hopital.entities;

import javax.persistence.*;

@Entity
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prescription", nullable = false)
    private Long id;
    private String medicine;
    @Column(name = "duration_prescription")
    private int durationPrescription;
    @OneToOne(mappedBy = "prescription")
    private Consultation consultation;

    public Prescription() {
    }

    public Prescription(String medicine, int durationPrescription, Consultation consultation) {
        this.medicine = medicine;
        this.durationPrescription = durationPrescription;
        this.consultation = consultation;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public int getDurationPrescription() {
        return durationPrescription;
    }

    public void setDurationPrescription(int durationPrescription) {
        this.durationPrescription = durationPrescription;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "id=" + id +
                ", medicine='" + medicine + '\'' +
                ", durationPrescription=" + durationPrescription +
                '}';
    }
}
