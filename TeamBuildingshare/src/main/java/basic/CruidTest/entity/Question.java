package basic.CruidTest.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "questions")
@Data
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private Long questionId;

    @Column(name = "test_id")
    private Long testId;

    @Column(name = "question")
    private String question;

    @Column(name = "opt_a")
    private String optA;

    @Column(name = "opt_b")
    private String optB;

    @Column(name = "opt_c")
    private String optC;

    @Column(name = "opt_d")
    private String optD;

    @Column(name = "answer")
    private Integer answer;

    // getters and setters
}
