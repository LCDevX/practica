package com.example.practica.service;

import com.example.practica.entities.Person;
import com.example.practica.repository.PersonRepository;
import com.example.practica.service.dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonService implements Idao<Person, Long> {

    @Autowired
    PersonRepository personRepository;


    @Override
    public List<Person> findAll() {
        return List.of();
    }

    @Override
    public Person getById(Long aLong) {
        return null;
    }

    @Override
    public void save(Person obje) {
        this.personRepository.save(obje);

    }

    @Override
    public void delete(Person obje) {
  this.personRepository.delete(obje);
    }
}
