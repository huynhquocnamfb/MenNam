package basic.CruidTest.service;

import basic.CruidTest.entity.Test;

import java.util.List;

public interface TestService {
    List<Test> getAllTests();

    Test createNewTest(Test test);

    String deleteTestById(Long id);
}