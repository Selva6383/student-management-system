package com.example.studentapi.repository;

import com.example.studentapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Repository layer - Spring Data JPA generates the implementation at runtime.
// Gives us save(), findAll(), findById(), deleteById() etc. with no boilerplate SQL.
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
