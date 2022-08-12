package com.github.GabrielRechBrand.plateauapi.repository;

import com.github.GabrielRechBrand.plateauapi.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
