package ch.mapirium.server.serviceregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MapiriumServiceRegistrationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapiriumServiceRegistrationServerApplication.class, args);
	}
}
