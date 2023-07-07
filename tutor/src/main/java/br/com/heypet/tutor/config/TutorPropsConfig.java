package br.com.heypet.tutor.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:tutor.properties")
public class TutorPropsConfig {
}
