package basic.CruidTest.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "team")
@Data
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    private Long teamId;
    @Column(name = "Name")
    private String name;

    // getters and setters
}
