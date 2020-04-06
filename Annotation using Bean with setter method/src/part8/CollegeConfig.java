package part8;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class CollegeConfig {
	
	@Bean
	public Principal principalbean() {
		return new Principal();
	}

	@Bean
	public College collegeBean() {
		College college = new College(); 
		college.setPrincipal(principalbean()); // setter method 
		return college;
	}	
}
