package com.iker.petvetbackend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "vets")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String role;
    private String password;
    private String email;

    public User() { }

    public User(String username, String role, String password, String email) {
        this.username = username;
        this.role = role;
        this.password = password;
        this.email = email;
    }
}
