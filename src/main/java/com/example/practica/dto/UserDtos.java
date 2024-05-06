package com.example.practica.dto;

import com.example.practica.entities.Role;
import jakarta.persistence.*;

import java.util.List;

public class UserDtos {

    private  Long id;

    private  String password;

    private List<Role> listroles;

}
