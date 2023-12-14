package basic.CruidTest.service.impl;

import basic.CruidTest.entity.Test;
import basic.CruidTest.repository.TestRepository;
import basic.CruidTest.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TestServiceImpl implements TestService {

    private final TestRepository testRepository;

    @Override
    public List<Test> getAllTests() {
        return testRepository.findAll();
    }
}
