package enzo.springframework.spring5_recipe_app.controllers;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping({"", "/", "/login"})
    public String getLoginPage(HttpSession session) {
        // Check if user is already logged in
        if (session != null && session.getAttribute("user") != null) {
            return "redirect:/index";
        }
        return "login";
    }

    @GetMapping("/index")
    public String getIndexPage(HttpSession session) {
        // Check if user is authenticated
        if (session == null || session.getAttribute("user") == null) {
            return "redirect:/login";
        }
        return "index";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        if (session != null) {
            session.invalidate();
        }
        return "redirect:/login";
    }
}