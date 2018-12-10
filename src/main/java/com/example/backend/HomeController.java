package com.example.backend;
import org.springframework.web.bind.annotation.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {
    
    @RequestMapping("/")
	public String home(){
		return "Hello World";
	}
}