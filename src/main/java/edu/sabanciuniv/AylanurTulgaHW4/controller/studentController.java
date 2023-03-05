package edu.sabanciuniv.AylanurTulgaHW4.controller;

import edu.sabanciuniv.AylanurTulgaHW4.model.Student;
import edu.sabanciuniv.AylanurTulgaHW4.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class studentController {
    @Autowired
    private studentService StudentService;

    @PostMapping("/students")
    public Student addNewStudent(@RequestBody Student student){

        return StudentService.addNewStudent(student);

    }
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return StudentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getSpecificId(Integer id){
        return StudentService.getSpecificId(id);
    }

    @PutMapping("/students")
    public Student updateStudentList(@RequestBody Student student){
        return StudentService.updateExistingStudentList(student);
    }

    @DeleteMapping("/students")
    public void deleteGivenStudent(@RequestBody Student student){
        StudentService.deleteGivenStudent(student);
    }


}
