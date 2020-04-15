package SourceCode;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MavenController implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub  
		
		AnnotationConfigWebApplicationContext webapplication = new  AnnotationConfigWebApplicationContext();
		webapplication.register(JavaConfigController.class);  // classpth xml file location
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webapplication); 
		
ServletRegistration.Dynamic myCustomDispatcherServlet = servletContext.addServlet("myDispatcherServelt", dispatcherServlet);
			
		
		myCustomDispatcherServlet.setLoadOnStartup(1); // iniatization 
		myCustomDispatcherServlet.addMapping("/mymebsite.com/*"); // mapping

		System.out.println("MavenProject");
	}

}
