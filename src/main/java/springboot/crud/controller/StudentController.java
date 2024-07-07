package springboot.crud.controller;

import springboot.crud.entity.Student;
import springboot.crud.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/saveStudent")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/fetchStudentList")
    public List<Student> fetchStudentList() {
        return studentService.fetchStudentList();
    }

    @PostMapping("updateStudent/{id}")
    public Student updateStudent(@RequestBody Student student, @PathVariable("id") Long studentId) {
        return studentService.updateStudent(student, studentId);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudentById(@PathVariable("id")
                                       Long studentId)
    {
        studentService.deleteStudentById(
                studentId);
        return "Student Deleted Successfully";
    }

}