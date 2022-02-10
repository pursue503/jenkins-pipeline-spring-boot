package com.jenkins.example.main;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MainController {

    @GetMapping("/test")
    public String test() {
        return "jenkins-test!!!";
    }

}
