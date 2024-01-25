package com.example.hopital.entities;

import javax.persistence.*;

@Entity
public class Care {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_care", nullable = false)
    private Long id;
    @Column(name = "type_care")
    private String typeCare;
    @Column(name = "duration_care")
    private int durationCare;
    @OneToOne(mappedBy = "care")
    private Consultation consultation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
