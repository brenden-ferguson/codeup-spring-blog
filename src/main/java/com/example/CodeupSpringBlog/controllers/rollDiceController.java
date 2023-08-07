package com.example.CodeupSpringBlog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class rollDiceController {
    @GetMapping("/roll-dice")
    public String askRoll() {
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{n}")
    public String rolled(@PathVariable int n, Model model) {
        int random = (int) (Math.random() * 6) + 1;
        model.addAttribute("number", n);
        model.addAttribute("random", random);
        boolean isCorrect = n == random;
        model.addAttribute("isCorrect", isCorrect);
        return "rolled-dice";
    }
}
