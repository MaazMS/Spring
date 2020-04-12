package maven.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
// implements dispatcher handle onStratup 
public class LoveCalculatorApplicationinitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		// Create dispatcher servlet object
		// register the dispatcher servelt with servlet context object 
		
		// interface  XmlWebApplicationContext 
		XmlWebApplicationContext webApplicatioContext = new XmlWebApplicationContext();
		webApplicatioContext.setConfigLocation("classpath:Application-config.xml");  // classp xml file location
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicatioContext); 
		// step 1 Dispatcher Servlet intialize the web application context 
		// gol to pass web application context 
		
		
		
		// register dispathcer servlet with sevlet context
		// any name of myDispatcherServelt  , servlet registration
		ServletRegistration.Dynamic myCustomDispatcherServlet = servletContext.addServlet("myDispatcherServelt", dispatcherServlet);
			
		
		myCustomDispatcherServlet.setLoadOnStartup(1); // iniatization 
		myCustomDispatcherServlet.addMapping("/mymebsite.com/*"); // mapping
		
		
		System.out.println("maven");

	}

}

// resources  folder properties and xml files 