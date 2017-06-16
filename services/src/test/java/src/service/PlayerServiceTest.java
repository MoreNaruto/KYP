package src.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import src.model.Player;
import src.repository.PlayerRepository;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

@RunWith(MockitoJUnitRunner.class)
public class PlayerServiceTest {
    @Mock
    private PlayerRepository playerRepository;

    private PlayerService playerService;

    @Before
    public void setUp() throws Exception {
        initMocks(PlayerServiceTest.class);
        playerService = new PlayerService(playerRepository);
    }

    @Test
    public void createPlayer_shouldSavePlayer() throws Exception {
        Player player = new Player.PlayerBuilder().setHeight(6.4).build();
        playerService.createPlayer(player);
        verify(playerRepository).save(player);
    }

    @Test
    public void getPlayers_shouldReturnAListOfPlayer() throws Exception {
        Player playerOne = new Player.PlayerBuilder()
                .setId(1L)
                .setHeight(6.4)
                .setName("Larry Bird")
                .setPosition("SG")
                .build();

        Player playerTwo = new Player.PlayerBuilder()
                .setId(2L)
                .setHeight(6.2)
                .setName("Russell Westbrook")
                .setPosition("PG")
                .build();

        List<Player> expectedPlayers = asList(playerOne, playerTwo);

        when(playerRepository.findAll()).thenReturn(expectedPlayers);

        assertEquals(playerService.getPlayers(), expectedPlayers);
    }
}