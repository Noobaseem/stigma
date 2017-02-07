package in.co.stimuli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@ComponentScan(basePackages = {"in.co.stimuli",
								"in.co.stimuli.services",
								"in.co.stimuli.security.service",
								"in.co.stimuli.security",
								"in.co.stimuli.api",
								"in.co.stimuli.config",
								"in.co.stimuli.dao",
								"in.co.stimuli.mapper",
								"in.co.stimuli.model"
								})
public class StimuliApplication {

	public static void main(String[] args) {
		SpringApplication.run(StimuliApplication.class, args);
	}
}