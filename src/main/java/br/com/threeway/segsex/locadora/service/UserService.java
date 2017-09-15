package br.com.threeway.segsex.locadora.service;

import br.com.threeway.segsex.locadora.dao.UserDao;
import br.com.threeway.segsex.locadora.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Created by Alex on 02/09/2017.
 */
public class UserService implements UserDetailsService {

    @Autowired
    UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userDao.findByUserName(username);
    }

    public void save(User user){
        if (user.getId() != null){
            changePassword(user.getPassword());
        }

        userDao.save(user);
    }

    private void changePassword(String password) {
        // todo fazer depois de criar bean do encriptador
    }
}
