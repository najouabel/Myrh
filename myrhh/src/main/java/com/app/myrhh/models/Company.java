package com.app.myrhh.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    @Column(name = "name", nullable = false)
    private String name;

    @Basic
    @Column(name = "login", unique = true)
    private String login;

    @Basic
    @Column(name = "password", nullable = false)
    private String password;

    @Basic
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Basic
    @Column(name = "phone", nullable = false)
    private String phone;

    @Basic
    @Column(name = "address", nullable = false)
    private String address;

    @Basic
    @Column(name = "image_url")
    private String imageUrl;


    public Company(String name,String login, String password, String email, String phone, String address, String imageUrl) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.imageUrl = imageUrl;
    }
}

