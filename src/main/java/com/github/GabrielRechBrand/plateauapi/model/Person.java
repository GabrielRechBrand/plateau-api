package com.github.GabrielRechBrand.plateauapi.model;

import com.github.GabrielRechBrand.plateauapi.enumeration.ProfessionEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Calendar;

@Entity
public class Person {

    @Column(name = "vale")
    private Long id;
    private String name;
    private String age;
    private Calendar dateOfBirth;


    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

}
