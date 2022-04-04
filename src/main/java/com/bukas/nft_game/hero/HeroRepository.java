package com.bukas.nft_game.hero;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HeroRepository extends MongoRepository<Hero, String> {

    Optional<Hero> findById(String id);


    Optional<List<Hero>> findByIdIn(List<String> id);

}
