package com.example.practica.repository;

import com.example.practica.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {

//    @Query (value =  "select * from roles where id= id")
//    public Role findAllid(Long id);
}
