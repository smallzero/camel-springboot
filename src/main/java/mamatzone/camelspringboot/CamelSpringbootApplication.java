package mamatzone.camelspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:camelContext.xml")
public class CamelSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelSpringbootApplication.class, args);
	}

}
