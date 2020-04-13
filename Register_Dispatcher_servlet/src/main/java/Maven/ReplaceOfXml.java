package Maven;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ReplaceOfXml implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
			
		// register the dispatcher servelt with servlet context object 

		XmlWebApplicationContext webApplicatioContext = new XmlWebApplicationContext();
		webApplicatioContext.setConfigLocation("classpath:Application-config.xml");  // classpth xml file location
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicatioContext); 
		
		ServletRegistration.Dynamic myCustomDispatcherServlet = servletContext.addServlet("myDispatcherServelt", dispatcherServlet);		
		myCustomDispatcherServlet.setLoadOnStartup(1); // iniatization dispatcher servlet 
		myCustomDispatcherServlet.addMapping("/mymebsite.com/*"); // mapping
		
		
		System.out.println("This maven program without web.xml file");
	}

}
