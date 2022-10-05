package com.lmlouis.projetSpringBoot.BusinessOrService;

import com.lmlouis.projetSpringBoot.EntitiesOrModel.Student;
import com.lmlouis.projetSpringBoot.IdaoRipository.StudentRipository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    // injection de dependance
    private final StudentRipository _StudentRipository;

    @Autowired
    public StudentService(StudentRipository studentRipository) {
        _StudentRipository = studentRipository;
    }

    public List<Student> getStudents(){
        return _StudentRipository.findAll();
    }

    public void addNewStudent(Student student) {
        System.out.println(student);
    }
}
