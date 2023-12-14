package basic.CruidTest.controller;

import basic.CruidTest.entity.Result;
import basic.CruidTest.service.ResultService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/result")
@AllArgsConstructor
public class ResultController {
    private final ResultService resultService;

    @GetMapping("/{userId}")
    public ResponseEntity<List<Result>> getResultsByUserId(@PathVariable Long userId) {
        List<Result> results = resultService.getResultsByUserId(userId);
        return new ResponseEntity<List<Result>>(results, HttpStatus.OK);
    }
}
