package com.bukas.nft_game.user;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping String addUser(@RequestParam("name") String name,
                                @RequestParam("email") String email){
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        return userService.addUser(user);
    }
}
