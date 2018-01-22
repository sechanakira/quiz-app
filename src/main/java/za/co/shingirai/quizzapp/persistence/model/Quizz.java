package za.co.shingirai.quizzapp.persistence.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "quizz")
public class Quizz extends BaseEntity {

    private QuizzConfiguration configuration;
    private List<Question> quuestions;

}
