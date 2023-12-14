package basic.CruidTest.service;

import basic.CruidTest.entity.Result;

import java.util.List;

public interface ResultService {
    List<Result> getResultsByUserId(Long userId);
}
