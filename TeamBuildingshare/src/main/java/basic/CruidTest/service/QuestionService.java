package basic.CruidTest.service;

import basic.CruidTest.entity.Question;

import java.util.List;

public interface QuestionService {
    List<Question> getQuestionsByTestId(Long testId);
    String editQuestion(Question question);
    Question getQuestionById(Long questionId);
    Question createQuestion(Question question);
}
