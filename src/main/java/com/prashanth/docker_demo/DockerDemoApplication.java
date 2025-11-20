package com.prashanth.docker_demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.TimeZone;

@SpringBootApplication
public class DockerDemoApplication {

	public static void main(String[] args) {
//        System.out.println("🕒 System TimeZone = " + TimeZone.getDefault().getID());

        //TO set timeZOne to UTC
        System.setProperty("user.timezone", "UTC");
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));

		SpringApplication.run(DockerDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(DockerDemoRepository dockerDemoRepository){
		return args -> {
			dockerDemoRepository.save( new DockerDemoEntity("Docker", "Created a new entity in the repository"));
		};
	}

}
