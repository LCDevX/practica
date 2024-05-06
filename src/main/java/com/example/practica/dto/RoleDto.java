package com.example.practica.dto;

import com.example.practica.entities.User;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;
@Data
public class RoleDto {


    private  Long Id;

    private  String name ;

    private  String abbreviation;

    private  String description;

    private  Boolean state;

    private List<User> users;

}
