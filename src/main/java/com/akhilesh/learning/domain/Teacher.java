package com.akhilesh.learning.domain;

import javax.persistence.Entity;

@Entity
public class Teacher extends Person {
    private String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(final String specialization) {
        this.specialization = specialization;
    }
}
