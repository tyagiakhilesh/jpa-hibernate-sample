package com.akhilesh.learning.domain;

import javax.persistence.Entity;

@Entity
public class Student extends Person {
    private String classRoom;

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(final String classRoom) {
        this.classRoom = classRoom;
    }
}
