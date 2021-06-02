package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc {
	String name = "sa";
	String pwd = "123";
	String url = "jdbc:sqlserver://localhost:1433;DatabaseName=BankSystem";
	String Driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

	public Connection getConn(){
		try {
			Class.forName(Driver);
			Connection conn = DriverManager.getConnection(url, name, pwd);
			return conn;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
		
	}
}
