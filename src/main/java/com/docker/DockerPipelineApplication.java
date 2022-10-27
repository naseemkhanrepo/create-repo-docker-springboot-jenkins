package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class DockerPipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerPipelineApplication.class, args);
	}
	@GetMapping("/Get")
public String getApi() {
	return "spring boot application initialized";
}
}
