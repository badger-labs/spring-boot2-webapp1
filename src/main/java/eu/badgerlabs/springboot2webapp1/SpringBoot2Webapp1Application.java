package eu.badgerlabs.springboot2webapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.reactive.HiddenHttpMethodFilter;

@SpringBootApplication
public class SpringBoot2Webapp1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2Webapp1Application.class, args);
	}

	@Bean
	HiddenHttpMethodFilter hiddenHttpMethodFilter() {
		return new HiddenHttpMethodFilter();
	}
}
