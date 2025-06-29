package com.mottu.patio.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API de Gestão de Pátios - Mottu")
                        .version("1.0")
                        .description("Documentação da API de pátios e motos da Mottu")
                        .contact(new Contact()
                                .name("Equipe Mottu")
                                .email("contato@mottu.com")
                        )
                );
    }
}
