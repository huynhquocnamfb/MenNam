package basic.CruidTest.service;

import basic.CruidTest.entity.RankUser;
import basic.CruidTest.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> getUserByUserName(String userName);

    List<RankUser> getRankUser();

    List<User> getUsers();
}
