package com.romanchuk.testapp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.romanchuk.testapp")
@PropertySource("classpath:musicPlayer.properties")
public class SprinConfig {
}
