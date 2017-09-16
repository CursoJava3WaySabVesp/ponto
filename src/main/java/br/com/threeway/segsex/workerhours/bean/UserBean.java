/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.threeway.segsex.workerhours.bean;

import br.com.threeway.segsex.workerhours.domain.User;
import br.com.threeway.segsex.workerhours.service.UserService;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author suporte
 */
public class UserBean implements Serializable {

    @Autowired
    private UserService userService;

    private User user = new User();

    public void cadastrar() {

        userService.save(user);

        user = new User();

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
