package basic.CruidTest.service.impl;

import basic.CruidTest.entity.Question;
import basic.CruidTest.repository.QuestionRepository;
import basic.CruidTest.service.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class QuestionServiceImpl implements QuestionService {
    private final QuestionRepository questionRepository;

    @Override
    public List<Question> getQuestionsByTestId(Long testId) {

        return questionRepository.findQuestionsByIdTestId(testId);
    }
}
