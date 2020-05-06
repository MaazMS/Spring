package DBConnection;

import java.sql.SQLException;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//it's close connection and if create new object for data base it's again open the connection  
// and close method is not open the connection again if connection is close .
public class Main {

	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
		
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("NewFile.xml");

		StudentDAO data = context.getBean("Student",StudentDAO.class);
		context.registerShutdownHook();  
		data.selectAllRow();
		data.destroy();
		
	}

}