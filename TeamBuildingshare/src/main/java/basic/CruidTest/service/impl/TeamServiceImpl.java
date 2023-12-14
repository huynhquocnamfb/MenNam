package basic.CruidTest.service.impl;

import basic.CruidTest.entity.RankTeam;
import basic.CruidTest.repository.TeamRepository;
import basic.CruidTest.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;

    @Override
    public List<RankTeam> getAllTeams() {
        return teamRepository.getAllTeam();
    }
}
