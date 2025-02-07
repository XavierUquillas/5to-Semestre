package com.example.Xavier1.zapatos;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Zapato {
    @Id
    @GeneratedValue (strategy =  GenerationType.AUTO)
    private long id;
    private String name;
    private String marca;

}