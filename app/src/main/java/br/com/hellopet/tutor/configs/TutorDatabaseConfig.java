package br.com.hellopet.tutor.configs;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:tutor.properties")
public class TutorDatabaseConfig {
    @Value("${tutor.datasource.url}")
    private String url;

    @Value("${tutor.datasource.username}")
    private String username;

    @Value("${tutor.datasource.password}")
    private String password;

    @Value("${tutor.datasource.driver-class-name}")
    private String driverClassName;

    @Value("${tutor.liquibase.change-log}")
    private String changelogFile;

    public DataSource tutorDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    public SpringLiquibase tutorLiquibase() {
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setChangeLog(changelogFile);
        liquibase.setDataSource(tutorDataSource());
        return liquibase;
    }
}
