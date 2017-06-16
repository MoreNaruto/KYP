package src.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import src.model.Player;
import src.repository.PlayerRepository;

import static org.junit.Assert.*;

public class PlayerServiceTest {
    @Mock
    private PlayerRepository playerRepository;

    private PlayerService playerService;

    @Before
    public void setUp() throws Exception {
        playerService = new PlayerService(playerRepository);
    }

    @Test
    public void createPlayer_shouldSavePlayer() throws Exception {
        Player player = new Player();

        playerService.createPlayer(player);
    }
}