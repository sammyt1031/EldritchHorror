package gameObjects.gameTokens.Cards;

import java.sql.*;
import java.util.*;

import database.DatabaseHandler;
import gameObjects.*;
import gameObjects.gameTokens.Cards.Item;

public final class Artifact extends Item {
	
	public static final Map<Integer, Artifact> ArtifactMap;
	
	private Artifact(String name, Expansion expansion, EnumSet<ItemFlags> flags) {
		super(name, expansion, flags);
	}
	
	static {
		
		Map<Integer, Artifact> map = new HashMap<Integer,Artifact>();
		
		Connection conn = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			
			conn = DriverManager.getConnection(DatabaseHandler.DATABASE_URL);
			statement = conn.prepareStatement("SELECT * FROM Artifacts");
			resultSet = statement.executeQuery();
			
			while (resultSet.next()) {
				
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String expansion = resultSet.getString(3);
				String strFlags = resultSet.getString(4);
				
				String[] arrFlags = strFlags.split(" ");				
				EnumSet<ItemFlags> setFlags = EnumSet.noneOf(ItemFlags.class);
				for (String str : arrFlags) {
					setFlags.add(ItemFlags.valueOf(str));
				}
				
				map.put(id, new Artifact(name, Expansion.valueOf(expansion), setFlags));
			
			}
			 	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DatabaseHandler.close(resultSet);
			DatabaseHandler.close(statement);
			DatabaseHandler.close(conn);
		}
		
		ArtifactMap = Collections.unmodifiableMap(map);
		
	}

}
