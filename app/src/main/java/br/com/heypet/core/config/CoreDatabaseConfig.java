package br.com.heypet.core.config;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:core.properties")
public class CoreDatabaseConfig {
    @Value("${core.datasource.url}")
    private String url;

    @Value("${core.datasource.username}")
    private String username;

    @Value("${core.datasource.password}")
    private String password;

    @Value("${core.datasource.driver-class-name}")
    private String driverClassName;

    @Value("${core.liquibase.change-log}")
    private String changelogFile;

    public DataSource coreDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    public SpringLiquibase coreLiquibase() {
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setChangeLog(changelogFile);
        liquibase.setDataSource(coreDataSource());
        return liquibase;
    }
}
