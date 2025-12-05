package com.bobo.human_resources_service.contorllers.info;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@Tag(name = "InfoController", description = "API 정보 조회 Controller")
public interface InfoControllerSwagger {


    @Operation(
            summary = "Java Version",
            description = "자바 버전 가져오기 해당 프로젝트의 Java Version 17 로 지정"
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

    @Operation(
            summary = "Build Version",
            description = "Build 버전 가져오기"
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
    @GetMapping("/build-version")
    ResponseEntity<String> getBuildVersion();
}
