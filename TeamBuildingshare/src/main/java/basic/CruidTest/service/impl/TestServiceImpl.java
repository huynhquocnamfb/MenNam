package basic.CruidTest.service.impl;

import basic.CruidTest.entity.Test;
import basic.CruidTest.repository.TestRepository;
import basic.CruidTest.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class TestServiceImpl implements TestService {

    private final TestRepository testRepository;

    @Override
    public List<Test> getAllTests() {
        return testRepository.findAll();
    }

    @Override
    public Test createNewTest(Test test) {
        return testRepository.save(test);
    }

    @Override
    public String deleteTestById(Long id) {
        Test exists = testRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Not found"));
        testRepository.delete(exists);
        return "DELETE SUCCESSFUL WITH ID: " + id;
    }
}
