package br.com.projetoibm;

import br.com.projetoibm.entitie.JogadorEntity;
import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class JogadorControllerTestes {

  @Autowired
  MockMvc mockMvc;

  @Test
  public void voidTestConsultaStatusServidorPost() throws Exception {
    JogadorEntity jogador = new JogadorEntity();
    jogador.setJogadorNome("João");
    jogador.setJogadorTime("Cogumelo");
    Gson gson = new Gson();

    MvcResult resultado = mockMvc.perform((MockMvcRequestBuilders.post("/times/jogador")
            .contentType(MediaType.APPLICATION_JSON)
            .content(gson.toJson(jogador))))
            .andExpect(MockMvcResultMatchers.status().isOk()).andReturn();

    String textoResposta = resultado.getResponse().getContentAsString();
    String textComparação = "Jogador cadastrado com sucesso";

    assert (textComparação.equals(textoResposta));  }

}
