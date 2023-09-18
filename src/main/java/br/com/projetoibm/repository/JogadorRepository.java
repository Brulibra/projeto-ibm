package br.com.projetoibm.repository;

import br.com.projetoibm.entitie.JogadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JogadorRepository extends JpaRepository<JogadorEntity, Integer> {

}
