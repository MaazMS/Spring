package MavenWebServer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

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
		Class aar[] = { JspConfig.class };
		return aar;
	}

	@Override
	// search front Controller
	// Confoguration Mapping ForDispatcher Servlet
	protected String[] getServletMappings() {
		String arr[] = { "/mywebsite.com/*" };
		// String arr[]= {"/"};

		return arr;
	}
}