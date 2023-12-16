package basic.CruidTest.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "test")
@Data
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "test_id")
    private Long testId;
    @Column(name = "name")
    private String name;
    @Column(name = "time")
    private LocalTime time;

    // getters and setters
}
