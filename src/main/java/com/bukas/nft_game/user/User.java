package com.bukas.nft_game.user;

import com.bukas.nft_game.hero.Hero;
import com.bukas.nft_game.item.Item;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.List;

@Document(collection = "users")
public class User {
    @Id
    private String id;
    @NotBlank(message = "Name is mandatory")
    private String name;
    @Email
    @NotBlank(message = "Email is mandatory")
    private String email;
    private List<Hero> ownedHeroes;
    private List<Item> ownedItems;
    private BigDecimal money;

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Hero> getOwnedHeroes() {
        return ownedHeroes;
    }

    public void setOwnedHeroes(List<Hero> ownedHeroes) {
        this.ownedHeroes = ownedHeroes;
    }

    public List<Item> getOwnedItems() {
        return ownedItems;
    }

    public void setOwnedItems(List<Item> ownedItems) {
        this.ownedItems = ownedItems;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
