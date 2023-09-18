package br.com.projetoibm.entitie;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="jogador")

public class JogadorEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "jogador-id", nullable = false)
  private Integer jogadorId;

  @Column(name = "jogador-nome", length = 45, nullable = false)
  private String jogadorNome;

  @Column(name = "jogador-time", length = 45, nullable = false)
  private String jogadorTime;

}
