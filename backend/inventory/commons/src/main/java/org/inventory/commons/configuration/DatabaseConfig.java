package org.inventory.commons.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

    @Configuration
    @Profile("default")
    @PropertySource({"classpath:db-local.properties"})
    static class TestProfile
    {

    }

    @Configuration
    @Profile("dev")
    @PropertySource("classpath:db-dev.properties")
    static class DefaultProfile
    { }


    @Value("${db.url}")
    private String dbUrl;

    @Value("${db.username}")
    private String dbUserName;

    @Value("${db.password}")
    private String dbPassword;

    @Value("${db.driver-class}")
    private String driverClassName;

    @Bean(name="inventory_ds")
    public DataSource dataSource()
    {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setUrl(dbUrl);
        ds.setUsername(dbUserName);
        ds.setPassword(dbPassword);
        ds.setDriverClassName(driverClassName);
        return ds;
    }

    @Bean(name="inventory_jt")
    public JdbcTemplate jdbcTemplate()
    {
        return new JdbcTemplate(dataSource());
    }
}
