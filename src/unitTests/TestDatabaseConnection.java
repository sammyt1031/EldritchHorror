package unitTests;

import static org.junit.Assert.*;

import java.sql.*;

import org.junit.Test;

import database.DatabaseHandler;

public class TestDatabaseConnection {

	@Test
	public void testDatabaseConnection() {
		
		Connection conn = DatabaseHandler.getConnection();
		
		try {
			PreparedStatement statement = conn.prepareStatement("SELECT * FROM AncientOnes WHERE Name = 'Azathoth'");
			ResultSet resultSet = statement.executeQuery();
			
			String name = resultSet.getString(2);
			assertEquals(name, "Azathoth");
			
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			fail("Found a SQLException");
		}
		
	}

}
