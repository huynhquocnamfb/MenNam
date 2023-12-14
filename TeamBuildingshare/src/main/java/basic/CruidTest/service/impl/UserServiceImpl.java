package basic.CruidTest.service.impl;

import basic.CruidTest.entity.RankUser;
import basic.CruidTest.entity.User;
import basic.CruidTest.repository.UserRepository;
import basic.CruidTest.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public Optional<User> getUserByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    @Override
    public List<RankUser> getRankUser() {
        return userRepository.getAllUser();
    }


}
