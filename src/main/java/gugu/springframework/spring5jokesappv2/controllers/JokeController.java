package gugu.springframework.spring5jokesappv2.controllers;/* cucul created on 30/09/2021 inside the package - gugu.springframework.spring5jokesappv2.controllers */

import gugu.springframework.spring5jokesappv2.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke",jokeService.getJoke());
        return "index";
    }
}
