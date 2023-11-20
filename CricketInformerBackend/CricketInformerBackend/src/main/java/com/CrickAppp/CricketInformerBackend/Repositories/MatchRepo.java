package com.CrickAppp.CricketInformerBackend.Repositories;

import com.CrickAppp.CricketInformerBackend.Entites.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface MatchRepo extends JpaRepository<Match,Integer> {
    //ftech match deails
    Optional<Match> findByTeamHeading(String teamHeading);
}
