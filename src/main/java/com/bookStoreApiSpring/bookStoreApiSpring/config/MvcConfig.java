package com.bookStoreApiSpring.bookStoreApiSpring.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig {

    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins(
                                "http://bookstore.modoblu.com",
                                "http://apibookstore.modoblu.com",
                                "http://localhost:4206",

                                "https://bookstore.modoblu.com",
                                "https://apibookstore.modoblu.com"
                        )
                        .allowedMethods("*")
                        .exposedHeaders("*")
                        .allowCredentials(true);  // <--- importante si envías cookies o cabeceras de autorización
            }
        };
    }
}