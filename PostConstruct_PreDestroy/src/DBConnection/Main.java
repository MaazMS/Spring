package DBConnection;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String args[]) throws ClassNotFoundException, SQLException {

		ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
		StudentDAO data = context.getBean("Student", StudentDAO.class);
		data.selectAllRow();
		data.closeConnection();
	}

}
