package br.com.threeway.segsex.workerhours.domain;

import org.springframework.security.core.GrantedAuthority;

public enum Permissao implements GrantedAuthority{
	ACESSAR_TELA_ADMINISTRATIVA;

	public String getAuthority(){
		return this.name();
	}
}
