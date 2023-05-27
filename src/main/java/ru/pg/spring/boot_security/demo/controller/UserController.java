package ru.pg.spring.boot_security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.pg.spring.boot_security.demo.model.User;
import ru.pg.spring.boot_security.demo.service.UserService;

import java.security.Principal;


@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public String viewAdminPage(Model model, Principal principal) {
        User principalUser = userService.findUserByEmail(principal.getName());
        model.addAttribute("user", principalUser);
        return "user";
    }
}

