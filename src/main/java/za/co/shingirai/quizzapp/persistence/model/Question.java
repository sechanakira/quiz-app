package za.co.shingirai.quizzapp.persistence.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "question")
public class Question extends BaseEntity {

    @Column(name = "text")
    private String text;
    @Column(name = "answers")
    private List<Answer> answers;
    @Column(name = "correct_answer")
    private Answer correctAnswer;

}
