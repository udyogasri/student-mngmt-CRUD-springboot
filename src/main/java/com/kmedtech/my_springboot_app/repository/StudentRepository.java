package com.kmedtech.my_springboot_app.repository;

import com.kmedtech.my_springboot_app.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // We can also define custom query methods here if needed, for example:
    Optional<Student> findByEmail(String email);
}
