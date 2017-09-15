package br.com.threeway.segsex.locadora.config;

import br.com.threeway.segsex.locadora.dao.LevelAccessDao;
import br.com.threeway.segsex.locadora.domain.LevelAccess;
import br.com.threeway.segsex.locadora.domain.Permission;
import br.com.threeway.segsex.locadora.domain.User;
import br.com.threeway.segsex.locadora.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by Alex on 02/09/2017.
 */
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    private LevelAccessDao papelDao;

    @Autowired
    private UserService usuarioService;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        LevelAccess levelAccess = new LevelAccess();
        levelAccess.setName("ADMIN");
        levelAccess.setPermissions(Arrays.asList(Permission.ADM_SCREEN_ACCESS));

        papelDao.save(levelAccess);

        User admin = new User();
        admin.setUserName("admin");
        admin.setPassword("admin");
        admin.setName("Admin");
        admin.setCpf("11111111111");
        admin.setCreatedDate(new Date());
        admin.setUpdatedDate(new Date());
        admin.setLevelAccesses(Arrays.asList(levelAccess));

        usuarioService.save(admin);
    }
}
