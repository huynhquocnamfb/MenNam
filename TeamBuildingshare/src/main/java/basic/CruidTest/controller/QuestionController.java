package basic.CruidTest.controller;


import basic.CruidTest.entity.Question;
import basic.CruidTest.service.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
@AllArgsConstructor
public class QuestionController {
     private final QuestionService questionService;

    @GetMapping("/{testId}")
    public ResponseEntity<List<Question>> getQuestionsByTestId(@PathVariable Long testId) {
        List<Question> questions = questionService.getQuestionsByTestId(testId);
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }
}
