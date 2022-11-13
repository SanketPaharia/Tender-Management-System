package com.masai.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBUtil {
	public DBUtil(){
		
		private static String url;
		private static String driverName;
		private static String username;
		private static String password;
		
		
		
	}
	
	static {	
		ResourceBundle rb = ResourceBundle.getBundle("dbdetails");
		
		String cs = rb.getString("db.url");
		String username = rb.getString("db.username");
		String password = rb.getString("db.password");
		String dbDriver = rb.getString("db.driverName");
		
	}
	
		
	public static Connection provideConnection(){		
		
		Connection conn = null;
				
				try {
					Class.forName(driverName);
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				try {
				conn = DriverManager.getConnection(url,username,password);
				
				}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return conn;
	}
	
	public static void closeConnection(PreparedStatement ps){
		
		try {
			if(ps != null)
				ps.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}
	
	public static void closeConnection(ResultSet rs){
		
		try {
			if(rs != null)
				rs.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}
	
	public static void closeConnection(Connection con){
		
		try {
			if(con != null)
				con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}
	
}
