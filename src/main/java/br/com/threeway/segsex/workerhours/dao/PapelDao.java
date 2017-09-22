package br.com.threeway.segsex.workerhours.dao;

import br.com.threeway.segsex.workerhours.domain.Papel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PapelDao extends JpaRepository<Papel, String> {

}
