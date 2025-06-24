package com.mottu.patio.controller;

import io.swagger.v3.core.util.Json;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenApiJsonController {

    private final OpenAPI openAPI;

    public OpenApiJsonController(@Qualifier("openApiDefinition") OpenAPI openAPI) {
        this.openAPI = openAPI;
    }

    @GetMapping("/openapi.json")
    public String getOpenApiJson() {
        return Json.pretty(openAPI);
    }
}
