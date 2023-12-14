package basic.CruidTest.repository;

import basic.CruidTest.entity.Question;
import basic.CruidTest.entity.RankTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RankTeamRepository extends JpaRepository<RankTeam, Long> {
    @Query(value = "select team.`Name`, team.team_id AS team_id_main,rankteam.id_rank_team, rankteam.score_sum from team, rankteam where team.team_id = rankteam.team_id ",nativeQuery = true)
    List<Question> findQuestionsByIdTestId();
}
