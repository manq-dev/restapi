package pl.oleksiak.restapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.oleksiak.restapi.model.Match;
import pl.oleksiak.restapi.service.MatchesService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MatchController {

    private final MatchesService matchesService;

    @GetMapping("/matches")
    public List<Match> getAllFinishedMatches() {
        return matchesService.getAllFinishedMatches();
    }

    @GetMapping("/matches/{id}")
    public Long getSinglePost(@PathVariable long id) {
        return id;
        //throw new IllegalArgumentException("Not implemented yet!");
    }
}
