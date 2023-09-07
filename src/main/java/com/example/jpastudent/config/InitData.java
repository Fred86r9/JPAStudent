package com.example.jpastudent.config;

import com.example.jpastudent.model.Student;
import com.example.jpastudent.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class InitData implements CommandLineRunner
{
    //Dependency injection of StudentRepository
    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception
    {
        Student s1 = new Student();
        s1.setBornDate(LocalDate.of(2000, 10, 10));
        s1.setBornTime(LocalTime.of(12,12));
        s1.setName("Erik");
        Student s2 = new Student();
        s2.setBornDate(LocalDate.of(2000, 10, 10));
        s2.setBornTime(LocalTime.of(12,12));
        s2.setName("ChatGPT");

        studentRepository.save(s1);
        studentRepository.save(s2);

    }
}
