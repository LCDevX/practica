package com.example.practica.service;

import com.example.practica.entities.Person;
import com.example.practica.service.dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements Idao<Person,Long> {

    @Autowired
    UserService userService;

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
    this.userService.save(obje);
    }

    @Override
    public void delete(Person obje) {
  this.userService.delete(obje);
    }
}
