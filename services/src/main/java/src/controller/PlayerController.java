package src.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import src.model.Player;
import src.service.PlayerService;

import java.util.List;

@RestController
public class PlayerController {

    private PlayerService service;

    public PlayerController(PlayerService service) {
        this.service = service;
    }

    @RequestMapping(value="/player/create", method = RequestMethod.POST)
    public void createPlayer(@RequestBody Player player) {
        service.createPlayer(player);
    }

    @RequestMapping(value="/players/retrieve", method = RequestMethod.GET)
    public List<Player> getPLayers(){
        return service.getPlayers();
    }
}
