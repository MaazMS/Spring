package SourceCode;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MavenMain implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub  
		
		XmlWebApplicationContext webApplicatioContext = new XmlWebApplicationContext();
		webApplicatioContext.setConfigLocation("classpath:Application-config.xml");  // classpth xml file location
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicatioContext); 
		
ServletRegistration.Dynamic myCustomDispatcherServlet = servletContext.addServlet("myDispatcherServelt", dispatcherServlet);
			
		
		myCustomDispatcherServlet.setLoadOnStartup(1); // iniatization 
		myCustomDispatcherServlet.addMapping("/mymebsite.com/*"); // mapping

		System.out.println("MavenProject");
	}

}
