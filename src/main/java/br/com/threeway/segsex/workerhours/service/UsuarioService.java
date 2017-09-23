package br.com.threeway.segsex.workerhours.service;

import br.com.threeway.segsex.workerhours.dao.UsuarioDao;
import br.com.threeway.segsex.workerhours.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements UserDetailsService {

	@Autowired
	private UsuarioDao usuarioDao;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public Usuario loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioDao.findByUsername(username);
		if(usuario == null){
			throw new UsernameNotFoundException(username);
		}
		return usuario;
	}

	public void save(Usuario usuario){
		if(usuario.getId() == null){
			changePassword(usuario);
		}
		usuarioDao.save(usuario);
	}

	public void changePassword(Usuario usuario) {
		usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
	}

}
