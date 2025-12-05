package com.bobo.human_resources_service.contorllers.info;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface InfoControllerSwagger {


    @Operation(
            summary = "get java version",
            description = "get java version"
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "HTTP Status OK"
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "HTTP Status Internal Server Error",
                    content = @Content(

                    )
            )
    }
    )
    @GetMapping("/java-version")
    ResponseEntity<String> getJavaVersion();
}
