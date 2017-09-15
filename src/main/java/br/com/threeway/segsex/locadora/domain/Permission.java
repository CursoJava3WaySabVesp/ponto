package br.com.threeway.segsex.locadora.domain;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by Alex on 02/09/2017.
 */
public enum Permission implements GrantedAuthority{
    ADM_SCREEN_ACCESS;

    @Override
    public String getAuthority() {
        return this.name();
    }
}
