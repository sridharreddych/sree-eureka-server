package sree.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SreeEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SreeEurekaServerApplication.class, args);
	}

}
