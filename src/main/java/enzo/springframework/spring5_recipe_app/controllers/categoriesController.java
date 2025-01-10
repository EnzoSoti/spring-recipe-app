package enzo.springframework.spring5_recipe_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class categoriesController {

    @GetMapping("/categories")
    public String getCategoriesPage() {
        return "categories";
    }
}