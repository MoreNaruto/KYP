package src.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import src.model.Player;

@RestController
public class PlayerController {

    @RequestMapping("/player")
    public Player createPlayer() {

    }
}
