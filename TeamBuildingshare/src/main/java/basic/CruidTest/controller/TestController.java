package basic.CruidTest.controller;

import basic.CruidTest.entity.Test;
import basic.CruidTest.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tests")
@AllArgsConstructor
public class TestController {
    private final TestService testService;

    @GetMapping
    public ResponseEntity<List<Test>> getAllTests() {
        List<Test> tests = testService.getAllTests();
        return new ResponseEntity<>(tests, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Test> createTest(@RequestBody Test test){
        return new ResponseEntity<>(testService.createNewTest(test),HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTest(@PathVariable Long id){
        return new ResponseEntity<>(testService.deleteTestById(id),HttpStatus.OK);
    }

}
