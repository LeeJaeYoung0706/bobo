package com.bobo.human_resources_service.contorllers.info;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/info")
public class InfoController implements InfoControllerSwagger {

    @Value("${build.version}")
    private String buildVersion;

    private final Environment environment;

    /**
     * Java Version 검색 환경 변수 처리
     * @return String 자바 환경 변수 JAVA_HOME 값
     */
    @Override
    public ResponseEntity<String> getJavaVersion() {
        String javaHome = environment.getProperty("JAVA_HOME");

        if (javaHome != null) {
            String lastName = javaHome.substring(javaHome.lastIndexOf("\\") + 1);
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(lastName);
        }

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .build();
    }
}
