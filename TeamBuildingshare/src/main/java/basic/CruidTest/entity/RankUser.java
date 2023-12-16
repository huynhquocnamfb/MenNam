package basic.CruidTest.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "rank_user")
@Data
public class RankUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rank_id")
    private Long rankId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "resut_id")
    private Long resultId;

    // getters and setters
}
