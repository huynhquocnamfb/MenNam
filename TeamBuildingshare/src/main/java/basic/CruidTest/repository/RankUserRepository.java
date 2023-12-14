package basic.CruidTest.repository;

import basic.CruidTest.entity.RankUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RankUserRepository extends JpaRepository<RankUser, Long> {
}
