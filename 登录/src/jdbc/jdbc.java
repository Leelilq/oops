package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbc {

	String userName="sa";
	String userPwd="123";
	String url="jdbc:sqlserver://localhost:1433;DatabaseName=userDB";
	String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	
	public Connection getConn(){
		try {
			Class.forName(driver);
			Connection conn=DriverManager.getConnection(url, userName, userPwd);
			return conn;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
