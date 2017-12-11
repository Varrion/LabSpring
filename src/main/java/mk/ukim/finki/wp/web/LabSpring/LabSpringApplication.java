package mk.ukim.finki.wp.web.LabSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class LabSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabSpringApplication.class, args);
	}
}
