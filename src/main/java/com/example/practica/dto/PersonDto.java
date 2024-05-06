package com.example.practica.dto;

import com.example.practica.entities.Sale;
import com.example.practica.entities.User;
import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.Data;

import java.sql.Date;
import java.util.Set;
@Data
public class PersonDto {

    private Long id ;

    private  String name;

    private  String lastname;


    private Date dateBirth;

    private String email;

    private String address;

    private  int documentId;

    private  int phone;


    private User user;


    private Set<Sale> saleSet;
}
