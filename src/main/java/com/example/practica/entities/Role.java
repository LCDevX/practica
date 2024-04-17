package com.example.practica.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table  ( name ="roles")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Role implements Serializable {


     @Id
    @Column ( name = "id", nullable = false)
        private  Long Id;
    @Column (name =  "name", length = 40)
        private  String name ;
    @Column (name = "abbreviation", length = 4)
        private  String abbreviation;
    @Column (name =  "description")
        private  String description;
    @Column (name = "state",columnDefinition = "boolean default false")
        private  Boolean state;
@ManyToMany (mappedBy = "listroles",cascade = CascadeType.PERSIST)
    private List<User> users;


}
