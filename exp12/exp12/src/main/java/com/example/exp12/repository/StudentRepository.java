package com.example.exp12.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.exp12.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}