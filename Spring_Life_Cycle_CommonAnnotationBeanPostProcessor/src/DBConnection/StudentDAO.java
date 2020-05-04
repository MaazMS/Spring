package DBConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.sql.DriverManager;
import java.sql.ResultSet;

public class StudentDAO {

	String url; // Database URL
	String dbName; // Databasename
	String dbDriver; // Drive name
	String userName; // user name
	String password; // password

	Connection con;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		System.out.println("url" );
		this.url = url;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		System.out.println("dbName" );
		this.dbName = dbName;
	}

	public String getDbDriver() {
		return dbDriver;
	}

	public void setDbDriver(String dbDriver) {
		System.out.println("dbName" );
		this.dbDriver = dbDriver;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		System.out.println("userName" );
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		System.out.println("password" );
		this.password = password;
	}

	@PostConstruct	
	public void init() throws ClassNotFoundException, SQLException {
		
		System.out.println("init" );
		connection();
	}
	
	public void connection() throws ClassNotFoundException, SQLException {
		
		System.out.println("connection" );

		Class.forName(dbDriver);

		con = DriverManager.getConnection(url, userName, password);

	}

	public void selectAllRow() throws ClassNotFoundException, SQLException {

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

	@PreDestroy
	public void closeConnection() throws  SQLException {
		System.out.println("close" );
		con.close();
	}
}