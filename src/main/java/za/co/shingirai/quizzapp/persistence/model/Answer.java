package za.co.shingirai.quizzapp.persistence.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "answer")
public class Answer extends BaseEntity {

    @Column(name = "question_id")
    private Long questionId;
    @Column(name = "text")
    private String text;

}
