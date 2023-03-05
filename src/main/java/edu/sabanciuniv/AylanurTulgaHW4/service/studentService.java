package edu.sabanciuniv.AylanurTulgaHW4.service;

import edu.sabanciuniv.AylanurTulgaHW4.model.Student;
import edu.sabanciuniv.AylanurTulgaHW4.repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class studentService {
    @Autowired
    private studentRepository StudentRepository;

    public Student addNewStudent(Student student){
        if (student.getName().length() > 100){
            throw new IllegalArgumentException("The student name can not be longer than 100 characters");
        }
        return StudentRepository.save(student);
    }

    public  List<Student> getAllStudents() {

        return StudentRepository.findAll();
    }
    public Student getSpecificId(Integer id) {
        Optional<Student> optionalStudent = StudentRepository.findById(id);
        if (optionalStudent.isPresent()) {
            return optionalStudent.get();
        } else {
            throw new RuntimeException("Student not found with id " + id);
        }
    }

    public  Student updateExistingStudentList(Student student) {

        return StudentRepository.save(student);
    }


    public  void deleteGivenStudent(Student student) {

        StudentRepository.delete(student);
    }
}
