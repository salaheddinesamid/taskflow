package com.project.taskflow.user_mangement.model;


import jakarta.persistence.*;
import lombok.Cleanup;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue
    @Column(name = "userID",nullable = false)
    Integer userID;

    @Column(name = "firstName",nullable = true)
    String firstName;

    @Column(name = "lastName", nullable = true)
    String lastName;

    @Column(name = "email",nullable = true)
    String email;

    @Column(name = "password",nullable = true)
    String password;

    @OneToOne
    @JoinColumn(name = "role")
    Role role;

}
