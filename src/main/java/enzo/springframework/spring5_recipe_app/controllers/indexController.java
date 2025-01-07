package enzo.springframework.spring5_recipe_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping({"", "/", "/login"})
    public String getLoginPage() {
        return "login";
    }

    @GetMapping("/index")
    public String getIndexPage() {
        return "index";
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/login";
    }
}