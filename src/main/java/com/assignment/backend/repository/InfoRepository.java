package com.assignment.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.backend.models.Info;

@Repository
public interface InfoRepository extends JpaRepository<Info, String> {
}
