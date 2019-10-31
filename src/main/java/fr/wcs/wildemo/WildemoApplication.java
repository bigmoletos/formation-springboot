package fr.wcs.wildemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({ "fr.wcs.wildemo.controller", "fr.wcs.wildemo.service",
		"fr.wcs.wildemo.repository", "fr.wcs.wildemo.config" })
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class WildemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WildemoApplication.class, args);
	}

}
