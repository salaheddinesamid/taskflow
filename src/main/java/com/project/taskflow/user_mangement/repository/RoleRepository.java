package com.project.taskflow.user_mangement.repository;

import com.project.taskflow.user_mangement.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Integer> {
}
