package springboot.crud.service;

import springboot.crud.entity.Student;
import springboot.crud.repository.StudentRepository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> fetchStudentList() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Student student, Long studentId) {

        Student studentDB = studentRepository.findById(studentId).get();

        if (Objects.nonNull(student.getStudentName())
                && !"".equalsIgnoreCase(
                student.getStudentName())) {
            studentDB.setStudentName(
                    student.getStudentName());
        }

        if (Objects.nonNull(student.getStudentMark())
                && !"".equalsIgnoreCase(
                student.getStudentMark())) {
            studentDB.setStudentMark(
                    student.getStudentMark());
        }

        if (Objects.nonNull(student.getStudentRank())
                && !"".equalsIgnoreCase(
                student.getStudentRank())) {
            studentDB.setStudentRank(
                    student.getStudentRank());
        }

        return studentRepository.save(studentDB);
    }

    @Override
    public void deleteStudentById(Long studentId) {
        studentRepository.deleteById(studentId);
    }
}