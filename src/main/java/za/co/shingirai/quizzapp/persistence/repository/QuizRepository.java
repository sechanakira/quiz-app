package za.co.shingirai.quizzapp.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.shingirai.quizzapp.persistence.model.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
