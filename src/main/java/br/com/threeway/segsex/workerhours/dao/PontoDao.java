package br.com.threeway.segsex.workerhours.dao;

import br.com.threeway.segsex.workerhours.domain.Ponto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PontoDao extends JpaRepository<Ponto, Long> {

}
