package DBConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class StudentDAO {

	String url = "jdbc:mysql://localhost:3306/"; // Database URL
	String dbName = "Student"; // 	Databasename
	String dbDriver = "com.mysql.cj.jdbc.Driver"; // Drive name
	String userName = "root"; // user name
	String password = ""; // password

	public void deleteRow(int StudentId) throws ClassNotFoundException, SQLException {

		Class.forName(dbDriver);

		Connection con = DriverManager.getConnection(url, userName, password);

		Statement st = con.createStatement();

		st.executeLargeUpdate("delete from Student.StudentInfo where Studentid =" + StudentId);

		System.out.println("Record deleted with the Studentid" + StudentId);

	}
}