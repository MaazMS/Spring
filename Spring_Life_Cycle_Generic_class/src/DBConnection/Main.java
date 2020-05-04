package DBConnection;

import java.sql.SQLException;

public class Main {

	public static void main(String args[]) throws ClassNotFoundException, SQLException {

		StudentDAO data = new StudentDAO();
		data.selectAllRow();
		data.deleteRow(2);
	}
}
