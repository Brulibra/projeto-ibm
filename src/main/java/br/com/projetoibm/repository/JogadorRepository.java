package br.com.projetoibm.repository;

import br.com.projetoibm.entitie.JogadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogadorRepository extends JpaRepository<JogadorEntity, Integer> {

}
