package com.mottu.patio.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.integration.SwaggerConfiguration;
import io.swagger.v3.oas.integration.api.OpenApiContext;
import io.swagger.v3.oas.integration.GenericOpenApiContextBuilder;
import java.util.Collections;

@Configuration
public class SwaggerConfig {

    @Bean(name = "openApiDefinition")
    public OpenAPI openApiDefinition() {
        return new OpenAPI()
                .info(new Info()
                        .title("Pátio API")
                        .version("1.0")
                        .description("API de gerenciamento de pátios da Mottu"));
    }

    @Bean
    public OpenApiContext openApiContext(OpenAPI openApiDefinition) throws Exception {
        SwaggerConfiguration config = new SwaggerConfiguration()
                .openAPI(openApiDefinition)
                .prettyPrint(true)
                .resourcePackages(Collections.singleton("com.mottu.patio.controller")); // <- Aqui define o pacote dos controllers

        return new GenericOpenApiContextBuilder()
                .openApiConfiguration(config)
                .buildContext(true);
    }
}
