package com.example.BookTown.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullname;
    private String email;
    private String password;
    private Long age;

    public User(String fullname, String email, String password, Long age) {
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.age = age;

    }
}
