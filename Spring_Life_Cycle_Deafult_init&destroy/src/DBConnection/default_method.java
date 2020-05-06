package DBConnection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class default_method {
	
	public void init() throws ClassNotFoundException, SQLException {
		
		System.out.println("init for xml" );
	}
	public void destroy() throws  SQLException {
	System.out.println("close for xml" );
	}

}
