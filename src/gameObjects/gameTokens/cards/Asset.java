package gameObjects.gameTokens.cards;

import java.sql.*;
import java.util.*;

import gameObjects.*;
import gameObjects.gameTokens.cards.Item.ItemFlags;
import utilities.DatabaseHandler;

public final class Asset extends Item {
	
	public static final Map<Integer, Asset> AssetMap;
	
	private final int cost;
	
	private Asset(String name, Expansion expansion, int cost, EnumSet<ItemFlags> flags) {
		super(name, expansion, flags);
		this.cost = cost;
	}
	
	public final int getCost() {
		return this.cost;
	}

	static {
		
		Map<Integer, Asset> map = new HashMap<Integer, Asset>();
		
		Connection conn = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			
			conn = DriverManager.getConnection(DatabaseHandler.DATABASE_URL);
			statement = conn.prepareStatement("SELECT * FROM Assets");
			resultSet = statement.executeQuery();
			
			while (resultSet.next()) {
				
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String expansion = resultSet.getString(3);
				int cost = resultSet.getInt(4);
				String strFlags = resultSet.getString(5);
				
				String[] arrFlags = strFlags.split(" ");				
				EnumSet<ItemFlags> setFlags = EnumSet.noneOf(ItemFlags.class);
				for (String str : arrFlags) {
					setFlags.add(ItemFlags.valueOf(str));
				}
				
				map.put(id, new Asset(name, Expansion.valueOf(expansion), cost, setFlags));
			
			}
			 	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DatabaseHandler.close(resultSet);
			DatabaseHandler.close(statement);
			DatabaseHandler.close(conn);
		}
		
		AssetMap = Collections.unmodifiableMap(map);
		
	}

}
