package com.example.practica.entities;


import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "people")
public class Person implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id", nullable = false)
    private Long id ;
@Column(name = "name", nullable = false,length = 50)
    private  String name;
@Column ( name = "lastname" , nullable = false , length = 50)
    private  String lastname;

@Timestamp
@Column (name = "dateBirth", nullable = false)
    private Date dateBirth;
@Column ( name = "email", nullable = false)
    private String email;
@Column (name = "address", nullable = false , length = 50)
    private String address;
@Column ( name = "documentId", nullable = false ,length = 11)
    private  int documentId;
@Column (name = "phone", nullable = false , length = 11)
    private  int phone;

  @OneToOne
  @PrimaryKeyJoinColumn
    private User user;

  @OneToMany (mappedBy = "fk_idPerson" , fetch = FetchType.EAGER , cascade = CascadeType.ALL)
private Set<Sale> saleSet;
}
