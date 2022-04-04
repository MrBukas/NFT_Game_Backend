package com.bukas.nft_game.hero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;


import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Validated
@Service
public class HeroService {
    private final HeroRepository heroRepository;

    public HeroService(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    public Optional<Hero> getHeroById(String id){
        return heroRepository.findById(id);
    }

    public Optional<List<Hero>> getAllHeroesById(List<String> id){
        return heroRepository.findByIdIn(id);
    }

    public String addHero(@Valid Hero hero){
        Hero h = heroRepository.save(hero);
        return h.getId();
    }
}
