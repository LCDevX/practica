package com.example.practica.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table (name = "sales")
@Data
public class Sale  implements Serializable {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column (name = "id")
private  Long id ;
@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
@JoinColumn(name = "fk_idPe rson",referencedColumnName = "id")
private  Person fk_idPerson;
}

