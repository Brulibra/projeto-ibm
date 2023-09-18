package br.com.projetoibm.controller;

import br.com.projetoibm.entitie.JogadorEntity;
import br.com.projetoibm.service.JogadorService;
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
  public void addNovoJogador(@RequestBody JogadorEntity jogador){
    if(jogador.getJogadorId() == null){
      jogadorService.addNovoJogador(jogador);
    }else{
      return;
    }
    return;
  }

    @DeleteMapping("jogador/all")
    public void deletaTimes(){
      jogadorService.deletaTimes();
      return;
    }

}
