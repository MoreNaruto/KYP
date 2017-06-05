package src.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import src.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    Player findByName(String name);
}
