package DBConnection;

import java.sql.SQLException;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
		
		ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("NewFile.xml");

		StudentDAO data = context.getBean("Student",StudentDAO.class);
		data.selectAllRow();
		data.destroy();
		
		default_method fix = context.getBean("fix",default_method.class);
		context.close();
	}

}