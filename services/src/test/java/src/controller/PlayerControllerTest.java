package src.controller;

import com.google.gson.Gson;
import model.Player;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PlayerControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void postRequest_createPlayer_returnAPlayerWithGivenRequestBody() throws Exception {
        Player testPlayer = new Player();
        String playerJson = new Gson().toJson(testPlayer);
        String url = "/player";

        ResultActions requestActions = this.mockMvc.perform(post(url)
                .contentType(MediaType.APPLICATION_JSON)
                .content(playerJson));

        requestActions
                .andExpect(status().isOk())
                .andReturn();
    }

}