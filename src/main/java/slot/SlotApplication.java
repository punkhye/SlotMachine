package slot; // your main class package

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"controller", "service", "model"})
public class SlotApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlotApplication.class, args);
	}
}
