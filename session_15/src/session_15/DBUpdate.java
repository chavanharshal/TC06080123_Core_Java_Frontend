package session_15;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class DBUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQL Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tns", "root", "root123" )
				
	}
}
