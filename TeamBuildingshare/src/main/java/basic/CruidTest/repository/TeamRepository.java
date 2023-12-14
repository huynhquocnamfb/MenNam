package basic.CruidTest.repository;
import basic.CruidTest.entity.RankTeam;
import basic.CruidTest.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<RankTeam, Long> {

    @Query(value = "select * from rankteam ",nativeQuery = true)
    List<RankTeam> getAllTeam();
}
