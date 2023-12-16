package basic.CruidTest.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "result")
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "result_id")
    private Long resultId;

    @Column(name = "user_id")
    private Long userId;
    @Column(name = "test_id")
    private Long testId;
    @Column(name = "score")
    private Integer score;

    // getters and setters
}
