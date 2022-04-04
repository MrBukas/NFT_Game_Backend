package com.bukas.nft_game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class })
public class NftGameApplication {

    public static void main(String[] args) {
        SpringApplication.run(NftGameApplication.class, args);
    }

}
