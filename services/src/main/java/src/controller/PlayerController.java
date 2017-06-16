package src.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import src.model.Player;
import src.service.PlayerService;

@Controller
public class PlayerController {

    private PlayerService service;

    public PlayerController(PlayerService service) {
        this.service = service;
    }

    @RequestMapping(value="/player/create", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void createPlayer(@RequestBody Player player) {
        service.createPlayer(player);
    }

    @RequestMapping(value="/players/retrieve", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String getPlayers(ModelMap modelMap){
        modelMap.put("players", service.getPlayers());
        return "playerList";
    }
}
