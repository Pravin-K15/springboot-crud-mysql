package springboot.crud.repository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springboot.crud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface StudentRepository extends JpaRepository<Student, Long> {
}