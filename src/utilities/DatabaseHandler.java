package database;

import java.sql.*;

public final class DatabaseHandler {
	
	public static final String DATABASE_URL = "jdbc:sqlite:EldritchHorror.db";
	
	public static final void close(ResultSet rs) {
		try {
			rs.close();
		} catch (Exception e) {
		}
	}
	
	public static final void close(PreparedStatement ps) {
		try {
			ps.close();
		} catch (Exception e) {			
		}
	}
	
	public static final void close(Connection conn) {
		try {
			conn.close();
		} catch (Exception e) {
		}
	}

}
