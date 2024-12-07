package com.project.taskflow.project_management.model;


import com.project.taskflow.task_management.model.Task;
import com.project.taskflow.team_management.model.Team;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer projectID;

    @Column(nullable = true)
    private String projectName;

    @Column(name = "created_at", nullable = true)
    private Date createdAt;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Task> tasks;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Team> teams;
}
