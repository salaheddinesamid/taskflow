package com.project.taskflow.task_management.model;

import com.project.taskflow.project_management.model.Sprint;
import com.project.taskflow.user_mangement.model.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private Integer taskID;

    @Column(name = "content", length = 255)
    private String content;

    @Enumerated(EnumType.STRING)
    @Column(name = "priority", nullable = false)
    private Priority priority;

    @OneToOne
    @JoinColumn(name = "created_by", nullable = false)
    private User createdBy;

    @OneToOne
    @JoinColumn(name = "assigned_to")
    private User assignedTo;

    @OneToOne
    @JoinColumn(name = "assigned_by", nullable = false)
    private User assignedBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name = "sprint_id")
    private Sprint sprint;

    @ManyToMany
    @JoinTable(
            name = "task_dependencies",
            joinColumns = @JoinColumn(name = "task_id"),
            inverseJoinColumns = @JoinColumn(name = "dependency_id")
    )
    private List<Task> dependencies;
}
