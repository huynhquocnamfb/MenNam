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
    @Column(name = "id_test")
    private Long idTest;
    @Column(name = "Name")
    private String name;
    @Column(name = "Time")
    private LocalTime time;

    // getters and setters
}
