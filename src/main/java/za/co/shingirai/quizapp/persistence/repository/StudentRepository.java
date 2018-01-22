package za.co.shingirai.quizapp.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.shingirai.quizapp.persistence.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
