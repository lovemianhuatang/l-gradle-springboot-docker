package com.codelong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LGradleSpringbootDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LGradleSpringbootDockerApplication.class, args);
    }

    /**
     * 用于测试是否启动成功
     */
    @GetMapping("/")
    public String getState() {
        return "服务启动成功";
    }

}
