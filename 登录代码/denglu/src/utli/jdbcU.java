package utli;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcU {

	private String name="sa";
	private String pwd="123";
	private String uli="jdbc:sqlserver://localhost:1433;DatabaseName=emply";
	private String Driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	
	public Connection getconn(){
		try {
			Class.forName(Driver);
			Connection conn=DriverManager.getConnection(uli, name, pwd);
			return conn;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
		
	}
}
