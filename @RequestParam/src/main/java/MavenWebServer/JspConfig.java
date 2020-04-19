package MavenWebServer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver; 

@Configuration 
@ComponentScan(basePackages="Controller")  // controller package 
public class JspConfig { 
	
	@Bean
	public	InternalResourceViewResolver viewResolver() {
	
	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	viewResolver.setPrefix("/WEB-INF/view/"); // foler name with / carefully
	viewResolver.setSuffix(".jsp");   // file extension before dot
	
	return viewResolver;
	} 

}