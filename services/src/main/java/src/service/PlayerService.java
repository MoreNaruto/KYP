package src.service;

import org.springframework.stereotype.Service;
import src.model.Player;
import src.repository.PlayerRepository;

import java.util.List;

@Service
public class PlayerService {
    private PlayerRepository repository;

    public PlayerService(PlayerRepository repository) {
        this.repository = repository;
    }

    public void createPlayer(Player player) {
        repository.save(player);
    }

    public List<Player> getPlayers() {
        return repository.findAll();
    }
}
