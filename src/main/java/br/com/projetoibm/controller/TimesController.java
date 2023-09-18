package br.com.projetoibm.controller;

import br.com.projetoibm.entitie.JogadorEntity;
import br.com.projetoibm.service.JogadorService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/times")
public class TimesController {

  @Autowired
  JogadorService jogadorService;

  @GetMapping
  public List<JogadorEntity> listaTimes (){
    return jogadorService.listaTimes();
  }

  @PostMapping("/jogador")
  public String addNovoJogador(@RequestBody JogadorEntity jogador){
    if(jogador.getJogadorId() == null){
      jogadorService.addNovoJogador(jogador);
    }else{
      return "Erro ao cadastrar Jogador!";
    }
    return "Jogador cadastrado com sucesso";
  }

    @DeleteMapping("jogador/all")
    public String deletaTimes(){
      jogadorService.deletaTimes();
      return "Usuário deletado com sucesso!";
    }

}
