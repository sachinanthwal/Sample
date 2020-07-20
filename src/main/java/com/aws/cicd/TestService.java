package com.aws.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestService {
    @GetMapping("/")
    public String getMessage()
    {
        return "Hello Sachin";
    }
}
