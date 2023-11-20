package com.CrickAppp.CricketInformerBackend.Service;

import com.CrickAppp.CricketInformerBackend.Entites.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {
    List<Match> getAllMatches();

    List<Match> getLiveMatches();

    List<List<String>> getPointTable();





}
