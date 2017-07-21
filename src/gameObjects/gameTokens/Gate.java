package gameObjects.gameTokens;

import java.sql.*;
import java.util.*;

import gameObjects.OmenTrack;
import utilities.DatabaseHandler;

public class Gate {
	
	private static final Map<Integer, Gate> GateMap;

	private final int location;
	private final EnumSet<OmenTrack.Omen> omens;
	
	private Gate(int location, EnumSet<OmenTrack.Omen> omens) {
		this.location = location;
		this.omens = omens;
	}
	
	static {
		
		Map<Integer, Gate> map = new HashMap<Integer, Gate>();
		
		Connection conn = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			
			conn = DriverManager.getConnection(DatabaseHandler.DATABASE_URL);
			statement = conn.prepareStatement("SELECT Gates.ID, Locations.ID, Gates.Omen "
											+ "FROM Locations "
											+ "INNER JOIN Gates "
											+ "ON Gates.Location = Locations.Name");
			resultSet = statement.executeQuery();
			
			while (resultSet.next()) {
				
				int gateId = resultSet.getInt(1);
				int locId = resultSet.getInt(2);
				String omen = resultSet.getString(3);
				
				EnumSet<OmenTrack.Omen> omens;
				if (omen.equals("BLUE")) {
					omens = EnumSet.of(OmenTrack.Omen.BLUE1, OmenTrack.Omen.BLUE2);
				} else {
					omens = EnumSet.of(Enum.valueOf(OmenTrack.Omen.class, omen));
				}
				
				map.put(gateId, new Gate(locId, omens));
			
			}
			 	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DatabaseHandler.close(resultSet);
			DatabaseHandler.close(statement);
			DatabaseHandler.close(conn);
		}
		
		GateMap = Collections.unmodifiableMap(map);
		
	}
	
}
