package com.project.taskflow.user_mangement.repository;

import com.project.taskflow.user_mangement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
