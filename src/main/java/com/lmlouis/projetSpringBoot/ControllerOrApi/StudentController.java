package com.lmlouis.projetSpringBoot.ControllerOrApi;

import com.lmlouis.projetSpringBoot.BusinessOrService.StudentService;
import com.lmlouis.projetSpringBoot.EntitiesOrModel.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/vbeta/students")
public class StudentController {

    private final StudentService _studentService;

    // injectioin de dependance

    @Autowired
    public StudentController(StudentService studentService) {
        this._studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){
        return _studentService.getStudents();
    }


    @PostMapping("/newStudents")
    public void RegisterNewStudent(@RequestBody Student student){
        _studentService.addNewStudent(student);
    }


}
