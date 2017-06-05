package src.service;

import src.model.Player;
import src.repository.PlayerRepository;

/**
 * Created by Asiaa on 6/4/17.
 */
public class PlayerService {
    private PlayerRepository repository;

    public PlayerService(PlayerRepository repository) {
        this.repository = repository;
    }

    public void createPlayer(Player player) {
        repository.save(player);
    }
}
