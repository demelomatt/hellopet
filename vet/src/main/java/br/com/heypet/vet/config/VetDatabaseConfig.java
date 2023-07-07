package br.com.heypet.vet.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:vet.properties")
public class VetDatabaseConfig {
    @Value("${vet.datasource.url}")
    private String url;

    @Value("${vet.datasource.username}")
    private String username;

    @Value("${vet.datasource.password}")
    private String password;

    @Bean
    public DataSource vetDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
