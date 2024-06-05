package com.DockerIamgeExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerIamgeExampleApplication {
	@GetMapping("/welcom")
	public String welcome(){
		return "This is first docker example";
	}

//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/javedtk/DockerImageExample.git
//	git push -u origin main

	public static void main(String[] args) {
		SpringApplication.run(DockerIamgeExampleApplication.class, args);
	}

}
