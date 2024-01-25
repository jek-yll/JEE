package com.example.hopital.entities;

import javax.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "consulation")
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_consultations", nullable = false)
    private Long id;
    private LocalDate dateConsultation;
    private String nameDoctor;
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
    @OneToOne
    @JoinColumn(name = "care_id", referencedColumnName = "id_care")
    private Care care;
    @OneToOne
    @JoinColumn(name = "prescription_id", referencedColumnName = "id_prescription")
    private Prescription prescription;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
