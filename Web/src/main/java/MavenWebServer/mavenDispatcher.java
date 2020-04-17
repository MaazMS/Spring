package MavenWebServer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//import com.sun.tools.doclets.internal.toolkit.Configuration;
public class mavenDispatcher extends AbstractAnnotationConfigDispatcherServletInitializer {

	// Browser and sreach *Abstract*
	
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override 
	// Register Dispatcher Servlet 
	protected Class<?>[] getServletConfigClasses() {
		Class aar[] = {JspConfig.class};
		return aar;
	}

	@Override 
	// search front Controller 
	// Confoguration Mapping ForDispatcher Servlet
	protected String[] getServletMappings() {
		String arr[]= {"/mywebsite.com/*"};   
		
		
		return arr;
	}

} 



