package com.project.taskflow.user_mangement.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Role {

    @Id
    @GeneratedValue
    @Column(name = "roleID" , nullable = false)
    Integer roleID;

    @Enumerated(EnumType.STRING)
    @Column(name = "roleName")
    RoleName roleName;
}
