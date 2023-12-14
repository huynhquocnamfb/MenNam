package basic.CruidTest.service.impl;

import basic.CruidTest.entity.Result;
import basic.CruidTest.repository.ResultRepository;
import basic.CruidTest.service.ResultService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ResultServiceImpl implements ResultService {
    private final ResultRepository resultRepository;

    @Override
    public List<Result> getResultsByUserId(Long userId) {
        return resultRepository.getResultsByUserId(userId);
    }
}
