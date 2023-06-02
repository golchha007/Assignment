package com.assignment.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.backend.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
