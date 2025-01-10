package enzo.springframework.spring5_recipe_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class recipeController {

    @GetMapping("/recipes")
    public String getRecipePage(){
        return ("recipe");
    }

}
