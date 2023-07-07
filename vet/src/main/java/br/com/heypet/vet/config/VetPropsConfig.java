package br.com.heypet.vet.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:vet.properties")
public class VetPropsConfig {
}
