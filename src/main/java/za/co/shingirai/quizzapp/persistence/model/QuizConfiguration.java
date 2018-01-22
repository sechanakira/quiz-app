package za.co.shingirai.quizzapp.persistence.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "quizz_config")
public class QuizConfiguration extends BaseEntity {

    @Column(name = "quizz_id")
    private Long quizzId;
    @Column(name = "randomize")
    private boolean randomize;

}
