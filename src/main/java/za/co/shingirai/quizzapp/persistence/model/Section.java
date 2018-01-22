package za.co.shingirai.quizzapp.persistence.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "section")
public class Section extends BaseEntity {

    @Column(name = "quiz_id")
    private Long quizId;
    @Column(name = "section_name")
    private String sectionName;
    @Column(name = "questions")
    private List<Question> questions;

}
