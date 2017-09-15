package br.com.threeway.segsex.locadora.util;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by Alex on 02/09/2017.
 */
public class PontoApplication extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return super.configure(builder);
    }

    public PasswordEncoder getPasswordEncoder(){

    }
}
