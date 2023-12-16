package basic.CruidTest.controller;


import basic.CruidTest.entity.Question;
import basic.CruidTest.service.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @PutMapping
    public ResponseEntity<String> editQuestion(@RequestBody Question question){
        return new ResponseEntity<>(questionService.editQuestion(question), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<Question> getQuestion(@PathVariable Long questionId){
        return new ResponseEntity<>(questionService.getQuestionById(questionId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Question> createNewQuestion(@RequestBody Question question){
        return new ResponseEntity<>(questionService.createQuestion(question), HttpStatus.OK);
    }
}
