package com.project.taskflow.team_management.model;


import com.project.taskflow.user_mangement.model.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Team {

    @Id
    @GeneratedValue
    @Column(name = "teamID",nullable = false)
    Integer teamID;

    @Column(name = "teamName", nullable = true)
    String teamName;

    @OneToMany
    List<User> teamMember;

}
