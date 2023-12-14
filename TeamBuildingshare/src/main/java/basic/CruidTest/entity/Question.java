package basic.CruidTest.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "question")
@Data
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_question")
    private Long idQuestion;

    @Column(name = "id_test")
    private Long IdTest;

    @Column(name = "Question")
    private String question;

    @Column(name = "Opt_A")
    private String optA;

    @Column(name = "Opt_B")
    private String optB;

    @Column(name = "Opt_C")
    private String optC;

    @Column(name = "Opt_D")
    private String optD;

    @Column(name = "Answer")
    private Integer answer;

    // getters and setters
}
