package basic.CruidTest.service.impl;

import basic.CruidTest.entity.Question;
import basic.CruidTest.repository.QuestionRepository;
import basic.CruidTest.service.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class QuestionServiceImpl implements QuestionService {
    private final QuestionRepository questionRepository;

    @Override
    public List<Question> getQuestionsByTestId(Long testId) {

        return questionRepository.findQuestionsByIdTestId(testId);
    }

    @Override
    public String editQuestion(Question question) {
        return questionRepository.save(question).getQuestion();
    }

    @Override
    public Question getQuestionById(Long questionId) {
        return questionRepository.findById(questionId).orElseThrow(() -> new NoSuchElementException("Not found"));
    }

    @Override
    public Question createQuestion(Question question) {
        return questionRepository.save(question);
    }


}
