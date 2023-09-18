package br.com.projetoibm.service;

import br.com.projetoibm.entitie.JogadorEntity;
import br.com.projetoibm.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service

public class JogadorService {

@Autowired
JogadorRepository jogadorRepository;

  public List<JogadorEntity> listaTimes() {
      return jogadorRepository.findAll();
  }
  public void addNovoJogador(JogadorEntity jogador) {
      jogadorRepository.save(jogador);
  }

  public void deletaTimes(){
    jogadorRepository.deleteAll();
  }

}


