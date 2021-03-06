package com.pilot.things.vicinity.adapterpilotthingsopa.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("vicinity.adapter")
@Getter
@Setter
public class AdapterConfig {
    String id;
}
