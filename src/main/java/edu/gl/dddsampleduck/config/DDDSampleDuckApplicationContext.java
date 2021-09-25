package edu.gl.dddsampleduck.config;

import edu.gl.dddsampleduck.application.BookingService;
import edu.gl.dddsampleduck.application.impl.BookingServiceImpl;
import edu.gl.dddsampleduck.domain.model.duck.DuckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({
        "classpath:context-interfaces.xml"})
public class DDDSampleDuckApplicationContext {

    @Autowired
    DuckRepository duckRepository;

    @Bean
    public BookingService bookingService() {
        return new BookingServiceImpl(duckRepository);
    }
}
