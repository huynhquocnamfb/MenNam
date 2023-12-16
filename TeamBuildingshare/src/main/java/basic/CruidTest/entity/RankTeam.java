package basic.CruidTest.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "rank_team")
@Data
public class RankTeam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rank_team")
    private Long idRankTeam;
    @Column(name = "team_id")
    private Long teamId;
    @Column(name = "score_sum")
    private Integer scoreSum;

    // getters and setters
}
