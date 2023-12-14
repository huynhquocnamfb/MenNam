package basic.CruidTest.repository;

import basic.CruidTest.entity.RankUser;
import basic.CruidTest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<RankUser, Long> {
    Optional<User> findByUserName(String userName);

    @Query(value = "select * from userrank ",nativeQuery = true)
    List<RankUser> getAllUser();
}
