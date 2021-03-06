package com.enrollee.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.sql.Date;


public class Dependent {
    @Id
    private String id;

    private String name;


    private String dateOfBirth;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
