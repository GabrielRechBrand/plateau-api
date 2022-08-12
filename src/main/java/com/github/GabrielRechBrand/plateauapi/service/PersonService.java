package com.github.GabrielRechBrand.plateauapi.service;

import com.github.GabrielRechBrand.plateauapi.model.Person;
import com.github.GabrielRechBrand.plateauapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public Optional<Person> findById(Long id) {
        return personRepository.findById(id);
    }



}
