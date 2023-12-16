package basic.CruidTest.config;

import basic.CruidTest.entity.Question;
import basic.CruidTest.entity.User;
import basic.CruidTest.repository.QuestionRepository;
import basic.CruidTest.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Random;

@RequiredArgsConstructor
@Component
public class QuestionConfiguration {

    private final QuestionRepository questionRepository;
    private final UserRepository userRepository;

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            // Create 20 Question entities and save them to the database
            for (int i = 1; i <= 20; i++) {
                Question question = new Question();
                question.setQuestion("Question " + i);
                question.setOptA("Option A for Question " + i);
                question.setOptB("Option B for Question " + i);
                question.setOptC("Option C for Question " + i);
                question.setOptD("Option D for Question " + i);
                question.setAnswer(i % 4 + 1); // Set answer based on some logic
                question.setTestId(new Random().nextLong(4) + 1);

                questionRepository.save(question);
            }

            for (int i = 1; i <= 10; i++) {
                User user = new User();
                user.setUsername("user" + i);
                user.setPassword("password" + i);
                user.setName("User " + i);
                user.setEmail("user" + i + "@example.com");
                user.setStatus(1);
                user.setTeamId((long) i);
                user.setRole(i % 3); // Assuming there are 3 roles (0, 1, 2)
                userRepository.save(user);
            }
        };
    }
}
