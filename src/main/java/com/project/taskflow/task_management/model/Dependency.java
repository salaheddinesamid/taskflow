package com.project.taskflow.task_management.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Dependency {

    @Id
    @GeneratedValue
    @Column(name = "dependencyID")
    Integer dependencyID;

    @OneToOne
    @JoinColumn(name = "task",nullable = true)
    Task task;

    @OneToMany
    @JoinColumn(name = "dependsOn")
    List<Task> dependsOn;
}
