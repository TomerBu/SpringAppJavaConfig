package edu.tomerbu.springdemos;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Spring App Configuration file
 */

@Configuration
@ComponentScan("edu.tomerbu.springdemos")
@PropertySource("app.properties")
public class AppConfig {

}
