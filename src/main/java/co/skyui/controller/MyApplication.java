
package co.skyui.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@SpringBootApplication
public class MyApplication {

    @RequestMapping("/api")
    String home() {
        return "Hello World Spring Boot - Using @RequestMapping /api";
    }

    @RequestMapping("/kafka")
    String dataStreaming() {
        return "TODO: Deploy kafka topic list - Using @RequestMapping /kafka";
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);


    }

}
