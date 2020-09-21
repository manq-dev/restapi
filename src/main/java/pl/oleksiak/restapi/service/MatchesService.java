package pl.oleksiak.restapi.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import pl.oleksiak.restapi.model.Match;

import java.util.Collections;
import java.util.List;

@Service
@Scope("singleton")
public class MatchesService {

    public List<Match> getAllFinishedMatches() {
        return Collections.emptyList();
    }
}
