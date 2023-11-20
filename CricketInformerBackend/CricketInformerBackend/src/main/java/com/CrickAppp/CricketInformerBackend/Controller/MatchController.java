package com.CrickAppp.CricketInformerBackend.Controller;

import com.CrickAppp.CricketInformerBackend.Entites.Match;
import com.CrickAppp.CricketInformerBackend.Service.MatchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {
    private MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    //get live matches
    @GetMapping("/live")
     public ResponseEntity<List<Match>>getLiveMatches(){
         return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);

     }

     //getall matches
    @GetMapping("/allMaches")
    public  ResponseEntity<List<Match>>getAllMatches(){
        return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
    }
}
