package com.example.practica.repository;

import com.example.practica.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository  extends JpaRepository <Person, Long>{

}
