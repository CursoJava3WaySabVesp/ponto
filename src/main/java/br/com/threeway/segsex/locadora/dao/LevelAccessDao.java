package br.com.threeway.segsex.locadora.dao;

import br.com.threeway.segsex.locadora.domain.LevelAccess;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Alex on 02/09/2017.
 */
public interface LevelAccessDao extends JpaRepository<LevelAccess, Long> {
}
