package basic.CruidTest.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "rankuser")
@Data
public class RankUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rank")
    private Long idRank;
    @Column(name = "id_user")
    private Long idUser;
    @Column(name = "id_result")
    private Long idResult;

    // getters and setters
}
