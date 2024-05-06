package com.example.practica.service;

import com.example.practica.entities.Role;
import com.example.practica.repository.RoleRepository;
import com.example.practica.service.dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class RoleService implements Idao<Role,Long> {

  @Autowired
  private RoleRepository roleRepository;

    @Override
    public List<Role> findAll() {
        return List.of();
    }

    @Override
    public Role getById(Long aLong) {
        return null;
    }

    @Override
    public void save(Role obje) {
     this.roleRepository.save(obje);
    }

    @Override
    public void delete(Role obje) {
    this.roleRepository.delete(obje);
    }
}
