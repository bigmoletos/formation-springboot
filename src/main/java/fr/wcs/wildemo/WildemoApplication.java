package fr.wcs.wildemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "fr.wcs.wildemo.controller", "fr.wcs.wildemo.service" })
public class WildemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WildemoApplication.class, args);
	}

}
