package com.github.GabrielRechBrand.plateauapi.controller;

import com.github.GabrielRechBrand.plateauapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("api/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(personService.findById(id));
    }


}
