package com.innovapptive.odatav2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.innovapptive.odatav2.entities.Member;
import com.innovapptive.odatav2.repository.MemberRepository;

@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient

public class Application extends SpringBootServletInitializer {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	/*@Bean
	public CommandLineRunner demo(final MemberRepository repository) {
	    return new CommandLineRunner() {
			public void run(String... args) throws Exception {
				if (repository.count() == 0) {
					log.info("Database is still empty. Adding some sample records");
					repository.save(new Member(1, "Jack", "Bauer"));
					repository.save(new Member(2, "Chloe", "O'Brian"));
					repository.save(new Member(3, "Kim", "Bauer"));
					repository.save(new Member(4, "David", "Palmer"));
					repository.save(new Member(5, "Michelle", "Dessler"));
				}
	        }
	    };
	}*/
	
	

}