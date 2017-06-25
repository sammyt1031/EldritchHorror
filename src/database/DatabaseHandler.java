package database;

import java.sql.*;

public final class DatabaseHandler {
	
	public static final Connection getConnection() {
		Connection conn = null;
		try {
			
			conn = DriverManager.getConnection("jdbc:sqlite:EldritchHorror");
					
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}

}
