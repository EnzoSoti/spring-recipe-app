package enzo.springframework.spring5_recipe_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class aboutController {

    @GetMapping("/about")
    public String getAboutPage() {
        return "about";
    }
}