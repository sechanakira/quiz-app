package za.co.shingirai.quizapp.persistence.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "quiz_config")
public class QuizConfiguration extends BaseEntity {

    @Column(name = "quiz_id")
    private Long quizzId;
    @Column(name = "randomize")
    private boolean randomize;

}
