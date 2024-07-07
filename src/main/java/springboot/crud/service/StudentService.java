package springboot.crud.service;

import springboot.crud.entity.Student;
import java.util.List;

public interface StudentService {

    Student saveStudent(Student student);

    List<Student> fetchStudentList();

    Student updateStudent(Student student, Long studentId);

    void deleteStudentById(Long studentId);
}