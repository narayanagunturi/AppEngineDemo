package com.example.demo;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

@RestController
public class HelloController {

    static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @RequestMapping("/")
    public String index() {
        logger.info("in method index");
        return "Greetings from Spring Boot!";
    }

}
