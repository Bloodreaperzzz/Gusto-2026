package com.Backend.Backend.Repository;


import com.Backend.Backend.Models.Match;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;



@Repository
public interface MatchRepository extends MongoRepository<Match, String> {



}