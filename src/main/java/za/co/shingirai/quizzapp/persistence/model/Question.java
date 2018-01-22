package za.co.shingirai.quizzapp.persistence.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "question")
public class Question extends BaseEntity {

    private String text;
    private List<Answer> answers;
    private Answer correctAnswer;

}
