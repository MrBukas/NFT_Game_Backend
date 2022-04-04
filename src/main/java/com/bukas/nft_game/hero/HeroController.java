package com.bukas.nft_game.hero;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/hero")
public class HeroController {
    private final HeroService heroService;

    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @GetMapping
    public Optional<List<Hero>> getAllHeroesById(@RequestParam List<String> id){
        return heroService.getAllHeroesById(id);
    }

    @PostMapping
    public String addHero(){
        return heroService.addHero(new Hero(10,9,8,7));
    }
}
