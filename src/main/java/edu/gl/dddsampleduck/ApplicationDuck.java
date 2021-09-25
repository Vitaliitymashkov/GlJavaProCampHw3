package edu.gl.dddsampleduck;

import edu.gl.dddsampleduck.config.DDDSampleDuckApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DDDSampleDuckApplicationContext.class})
@EnableAutoConfiguration
public class ApplicationDuck {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationDuck.class, args);
    }
}