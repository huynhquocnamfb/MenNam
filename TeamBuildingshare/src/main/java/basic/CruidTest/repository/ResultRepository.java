package basic.CruidTest.repository;

import basic.CruidTest.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultRepository  extends JpaRepository<Result, Long> {
    @Query(value = "SELECT * FROM Result WHERE id_user = :userId",nativeQuery = true)
    List<Result> getResultsByUserId(Long userId);
}
