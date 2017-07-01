package gameObjects.locationData;

import java.sql.*;
import java.util.*;

import database.DatabaseHandler;
import gameObjects.*;

public final class Location extends GamePiece {
	
	public static final Map<Integer, Location> LocationMap;
	
	private final List<Path> paths = new ArrayList<Path>();
	private final LocationType locType;
	
	private Location(String name, LocationType locType) {
		super(name, Expansion.VANILLA);
		this.locType = locType;
	}
		
	/**
	 * @return the locType_
	 */
	public final LocationType getLocType() {
		return this.locType;
	}
		
	/**
	 * @return an unmodifiable version of the single final reference to the path list of this location
	 */
	public final List<Path> getPaths() {
		return Collections.unmodifiableList(this.paths);
	}
	
	static {
			
		Map<Integer, Location> map = new HashMap<Integer, Location>();
		
		Connection conn = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			
			conn = DriverManager.getConnection(DatabaseHandler.DATABASE_URL);
			statement = conn.prepareStatement("SELECT * FROM Locations");
			resultSet = statement.executeQuery();
			
			while (resultSet.next()) {
				
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String locType = resultSet.getString(3);
				
				map.put(id, new Location(name, LocationType.valueOf(locType)));
			
			}
			 	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DatabaseHandler.close(resultSet);
			DatabaseHandler.close(statement);
			DatabaseHandler.close(conn);
		}
		
		LocationMap = Collections.unmodifiableMap(map);
		
	}
	
	static {
		
		Connection conn = null;
		PreparedStatement srcStatement = null;
		PreparedStatement destStatement = null;
		ResultSet srcResultSet = null;
		ResultSet destResultSet = null;
		try {
			
			conn = DriverManager.getConnection(DatabaseHandler.DATABASE_URL);
			
			srcStatement = conn.prepareStatement("SELECT Locations.ID FROM Locations INNER JOIN Paths ON Locations.Name = Paths.Source");
			srcResultSet = srcStatement.executeQuery();
			
			destStatement = conn.prepareStatement("SELECT Locations.ID, Paths.PathType FROM Locations INNER JOIN Paths ON Locations.Name = Paths.Destination");
			destResultSet = destStatement.executeQuery();
			
			while (srcResultSet.next() && destResultSet.next()) {
				
				int srcMapKey = srcResultSet.getInt(1);
				int dest = destResultSet.getInt(1);
				String pathType = destResultSet.getString(2);
				
				Location loc = LocationMap.get(srcMapKey);
				loc.paths.add(new Path(dest, PathType.valueOf(pathType)));
			
			}
						 	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DatabaseHandler.close(destResultSet);
			DatabaseHandler.close(srcResultSet);
			DatabaseHandler.close(destStatement);
			DatabaseHandler.close(srcStatement);
			DatabaseHandler.close(conn);
		}
		
	}
	
}