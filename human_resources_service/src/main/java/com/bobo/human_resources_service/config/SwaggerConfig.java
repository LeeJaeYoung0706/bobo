package com.bobo.human_resources_service.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.models.OpenAPI;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "JaeYoung Human Resources Service",
                description = "JaeYoung Human Resources Service",
                version = "v1",
                contact = @Contact(name = "JaeYoung", email = "support@example.com"),
                license = @License(name = "Apache 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0.html")
        )
)
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi apiInfoGroup() {
        return GroupedOpenApi.builder()
                .group("API information")
                .displayName("API 기본 정보 Information")
                .pathsToMatch("/api/info/*")
                .build();
    }

}
