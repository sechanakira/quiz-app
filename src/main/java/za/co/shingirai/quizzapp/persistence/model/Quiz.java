package za.co.shingirai.quizzapp.persistence.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "quizz")
public class Quiz extends BaseEntity {

    @Column(name = "configuration")
    private QuizConfiguration configuration;
    @Column(name = "sections")
    private List<Section> sections;
    @Column(name = "allowed_time")
    private Long allowedTime;

}
