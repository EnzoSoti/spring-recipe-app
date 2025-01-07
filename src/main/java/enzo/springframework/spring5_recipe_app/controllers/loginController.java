package enzo.springframework.spring5_recipe_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {

    @PostMapping("/login")
    public String processLogin(@RequestParam String email,
                               @RequestParam String password) {
        // Simple credential check
        if ("admin".equals(email) && "admin".equals(password)) {
            return "redirect:/index";
        }
        return "redirect:/login?error=true";
    }
}