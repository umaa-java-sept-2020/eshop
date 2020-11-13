package org.inventory.commons.init;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class FlywayInit implements InitializingBean {

    @Autowired
    @Qualifier("inventory_ds")
    private DataSource dataSource;

    @Override
    public void afterPropertiesSet() throws Exception {
        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.migrate();
    }
}
