package edu.sabanciuniv.AylanurTulgaHW4.repository;

import edu.sabanciuniv.AylanurTulgaHW4.model.Student;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface studentRepository extends JpaRepository<Student, Integer> {
}
