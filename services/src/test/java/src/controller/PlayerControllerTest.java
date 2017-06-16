package src.controller;

import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import src.model.Player;
import src.service.PlayerService;

import java.util.List;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PlayerControllerTest {
    @InjectMocks
    private PlayerController controller;

    @Mock
    private PlayerService mockService;

    @Autowired
    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        mockMvc = standaloneSetup(controller)
                .build();
    }

    @Test
    public void createPlayer_return204Response() throws Exception {
        Player.PlayerBuilder testPlayerBuilder = new Player.PlayerBuilder();
        Player player = testPlayerBuilder.setId(1L).setHeight(6.4).setName("Larry").build();
        String playerJson = new Gson().toJson(player);
        String url = "/player/create";

        ResultActions requestActions = this.mockMvc.perform(post(url)
                .contentType(MediaType.APPLICATION_JSON)
                .content(playerJson));

        requestActions
                .andExpect(status().isNoContent())
                .andReturn();
    }

    @Test
    public void retrievePlayers_getAllPlayers() throws Exception {
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
        when(mockService.getPlayers()).thenReturn(expectedPlayers);

        mockMvc.perform(get("/players/retrieve"))
                .andExpect(status().isOk())
                .andExpect(model().attribute("players", expectedPlayers));
    }
}