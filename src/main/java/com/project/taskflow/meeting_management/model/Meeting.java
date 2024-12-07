package com.project.taskflow.meeting_management.model;


import com.project.taskflow.user_mangement.model.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Meeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer meetingID;

    @Column(name = "meetingName")
    private String meetingName;

    @Column(name = "startDate")
    Date startDate;

    @Column(name = "endDate")
    Date endDate;

    @OneToMany
    List<User> members;

    @OneToOne
    User createdBy;
}
