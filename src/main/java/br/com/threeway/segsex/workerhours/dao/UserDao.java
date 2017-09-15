package br.com.threeway.segsex.workerhours.dao;

import br.com.threeway.segsex.workerhours.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Created by Alex on 02/09/2017.
 */
public interface UserDao extends JpaRepository<User, Long> {

    UserDetails findByUserName(String userName);
}
