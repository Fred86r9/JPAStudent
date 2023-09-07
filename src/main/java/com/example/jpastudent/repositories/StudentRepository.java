package com.example.jpastudent.repositories;

import com.example.jpastudent.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


//JpaRepository<Student,Integer> => JpaRepository<Class, Type of primary key>
public interface StudentRepository extends JpaRepository<Student,Integer>
{
    List<Student> findAllByName(String name);
    Optional<Student> findByName(String name);
}
