CREATE DATABASE if not exists hopital_bdd;

use hopital_bdd;

CREATE TABLE Care
(
    id_care       BIGINT NOT NULL,
    type_care     VARCHAR(255) NULL,
    duration_care INT NULL,
    CONSTRAINT pk_care PRIMARY KEY (id_care)
);

CREATE TABLE Prescription
(
    id_prescription       BIGINT AUTO_INCREMENT NOT NULL,
    medicine              VARCHAR(255) NULL,
    duration_prescription INT NULL,
    CONSTRAINT pk_prescription PRIMARY KEY (id_prescription)
);

CREATE TABLE consulation
(
    id_consultations BIGINT AUTO_INCREMENT NOT NULL,
    dateConsultation date NULL,
    nameDoctor       VARCHAR(255) NULL,
    patient_id       BIGINT NULL,
    care_id          BIGINT NULL,
    prescription_id  BIGINT NULL,
    CONSTRAINT pk_consulation PRIMARY KEY (id_consultations)
);

CREATE TABLE patient
(
    id_patient BIGINT AUTO_INCREMENT NOT NULL,
    firstname  VARCHAR(255) NULL,
    lastname   VARCHAR(255) NULL,
    date_birth date NULL,
    photo      BLOB NULL,
    CONSTRAINT pk_patient PRIMARY KEY (id_patient)
);

CREATE TABLE user
(
    id       BIGINT AUTO_INCREMENT NOT NULL,
    username VARCHAR(255) NULL,
    password VARCHAR(255) NULL,
    CONSTRAINT pk_user PRIMARY KEY (id)
);

ALTER TABLE consulation
    ADD CONSTRAINT uc_consulation_care UNIQUE (care_id);

ALTER TABLE consulation
    ADD CONSTRAINT uc_consulation_prescription UNIQUE (prescription_id);

ALTER TABLE consulation
    ADD CONSTRAINT FK_CONSULATION_ON_CARE FOREIGN KEY (care_id) REFERENCES Care (id_care);

ALTER TABLE consulation
    ADD CONSTRAINT FK_CONSULATION_ON_PATIENT FOREIGN KEY (patient_id) REFERENCES patient (id_patient);

ALTER TABLE consulation
    ADD CONSTRAINT FK_CONSULATION_ON_PRESCRIPTION FOREIGN KEY (prescription_id) REFERENCES Prescription (id_prescription);