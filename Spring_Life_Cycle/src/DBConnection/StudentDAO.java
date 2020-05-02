package DBConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class StudentDAO {

	String url = "jdbc:mysql://localhost:3306/"; // Database URL
	String dbName = "Student"; // Databasename
	String dbDriver = "com.mysql.cj.jdbc.Driver"; // Drive name
	String userName = "root"; // user name
	String password = ""; // password

	public void selectAllRow() throws ClassNotFoundException, SQLException {

		Class.forName(dbDriver);

		Connection con = DriverManager.getConnection(url, userName, password);

		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery("Select * from Student.StudentInfo");

		while (rs.next()) {

			int StudentId = rs.getInt(1);
			String Name = rs.getString(2);
			String Class = rs.getString(3);

			System.out.println("Studentid" + StudentId);
			System.out.println("StudentName" + Name);
			System.out.println("StudentClass" + Class);
		}
	}
}