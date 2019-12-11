package com.example.testsqldata.entity;

import javax.persistence.*;

@Entity
@Table(name = "testyy")
public class Testyy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

}
