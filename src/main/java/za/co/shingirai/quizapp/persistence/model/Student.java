package za.co.shingirai.quizapp.persistence.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Table
@Entity(name = "student")
public class Student extends BaseEntity {

    @Column(name = "student_id")
    private String studentId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "mobile_number")
    private String mobileNumber;
    @Column(name = "email")
    private String email;
    @Column(name = "grade")
    @Enumerated(EnumType.STRING)
    private Grade grade;

}
