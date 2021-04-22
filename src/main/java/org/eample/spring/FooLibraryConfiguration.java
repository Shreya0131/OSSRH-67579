package org.example.spring;

import org.example.spring.service.FooLibraryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.spring")
public class FooLibraryConfiguration {
    @Bean
    public FooLibrary fooLibrary() {
        return new FooLibraryService();
    }
}
