package com.bukas.nft_game.hero;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;


@Document(collection = "heroes")
public class Hero {
    @Id
    private String id;
    private String owner_id;
    private int attack;
    private int defense;
    private int lvl;
    private int exp;

    public Hero(String id, int attack, int defense, int lvl, int exp) {
        this.id = id;
        this.attack = attack;
        this.defense = defense;
        this.lvl = lvl;
        this.exp = exp;
    }

    public Hero(int attack, int defense, int lvl, int exp) {
        this.attack = attack;
        this.defense = defense;
        this.lvl = lvl;
        this.exp = exp;
    }

    public Hero() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
