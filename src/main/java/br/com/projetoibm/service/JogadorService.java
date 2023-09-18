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
  public List<String> addNovoJogador(JogadorEntity jogador) {

    List<String> umJogador = List.of(jogador.getJogadorTime());

      jogadorRepository.save(jogador);
      return addNovoJogador(umJogador);
  }
  public List<String> addNovoJogador(List<String> jogador) {

      Map<String, List<String>> times = new HashMap<>();

      for(String novoTime : jogador){

        List<String> nomeJogador = List.of(novoTime.split(" "));
        String sobrenove = String.valueOf(nomeJogador.get(1));
        String nomeDoTime = String.valueOf(sobrenove.charAt(0));

        List<String> addNovoTime = times.get(nomeDoTime);

        if (!times.containsKey(nomeDoTime)){
          times.put(nomeDoTime, new ArrayList<>());
          times.get(nomeDoTime).add(nomeJogador.toString());
        } else {

          for (String mesmoSobreNome : addNovoTime){
            if(mesmoSobreNome.endsWith(sobrenove)){

              times.put(sobrenove, new ArrayList<>());
              times.get(sobrenove).add(nomeJogador.toString());
            }
          }
          times.get(nomeDoTime).add(nomeJogador.toString());

        }
    }

    return null;
  }


  public void deletaTimes(){

    jogadorRepository.deleteAll();
  }

}


