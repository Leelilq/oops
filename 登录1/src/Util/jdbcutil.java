package Util;

import java.sql.*;

public class jdbcutil {
		String name ="aa";
		String pwd ="123";
		String url = "jdbc:sqlserver://localthhost:1433;Databaseanme=UserDB";
		String Driver = "com.microsoft.sqlserver.jdbc.sqlserverDriver";
	
		public Connection GetConn(){
			try {
				Class.forName(Driver);
				Connection conn = DriverManager.getConnection(url, name, pwd);
				return conn;
			} catch (Exception e) {
				System.out.println(e);
				return null;
			}
		}

}
