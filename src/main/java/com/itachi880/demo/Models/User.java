package com.itachi880.demo.Models;

import jakarta.persistence.*;
@Table(name = "users")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    @Override
    public String toString() {
        return "id : "+this.id+" , email : "+this.email;
    }

}
