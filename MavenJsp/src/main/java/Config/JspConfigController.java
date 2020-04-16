package Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration 
@ComponentScan(basePackages="Controller")
public class JspConfigController {
 
	@Bean
	public	InternalResourceViewResolver viewResolver() {
	
	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	viewResolver.setPrefix("/WEB-INF/view/");
	viewResolver.setSuffix(".jsp"); // add dot before file
	
	return viewResolver;
	} 
}
