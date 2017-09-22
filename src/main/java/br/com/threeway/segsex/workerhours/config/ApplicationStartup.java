package br.com.threeway.segsex.workerhours.config;

import br.com.threeway.segsex.workerhours.dao.PapelDao;
import br.com.threeway.segsex.workerhours.domain.Papel;
import br.com.threeway.segsex.workerhours.domain.Permissao;
import br.com.threeway.segsex.workerhours.domain.Usuario;
import br.com.threeway.segsex.workerhours.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;

@Component
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent> {

	@Autowired
	private PapelDao papelDao;
	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		Papel papel = new Papel();
		papel.setNome("ADMIN");
		papel.setPermissoes(Arrays.asList(Permissao.ACESSAR_TELA_ADMINISTRATIVA));

		papelDao.save(papel);

		Usuario admin = new Usuario();
		admin.setUsername("admin");
		admin.setPassword("admin");
		admin.setNome("Admin");
		admin.setCpf("11111111111");
		admin.setDataDeCadastro(new Date());
		admin.setDataDeAtualizacao(new Date());
		admin.setPapeis(Arrays.asList(papel));

		usuarioService.save(admin);
	}
}
