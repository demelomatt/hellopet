package br.com.heypet.tutor.config;

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

    @Bean
    public DataSource tutorDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
