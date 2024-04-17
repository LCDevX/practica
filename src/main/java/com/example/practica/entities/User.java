package com.example.practica.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table ( name ="users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User  implements Serializable {
         @Id
         @GeneratedValue(strategy = GenerationType.IDENTITY)
         private  Long id;
         @Column (name = "password",length = 25)
         private  String password;
        @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
         @JoinTable(name = "user_roles",joinColumns = @JoinColumn(name = "role_id",nullable = false),
            inverseJoinColumns = @JoinColumn(name = "user_id",nullable = false)
         )
      private  List<Role> listroles;

}
