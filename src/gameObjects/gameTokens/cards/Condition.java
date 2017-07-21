package gameObjects.gameTokens.cards;

import java.sql.*;
import java.util.*;

import gameObjects.Expansion;
import utilities.DatabaseHandler;

public final class Condition extends Card {
	
	public static enum ConditionFlags {
		DEAL, COMMON, MADNESS, INJURY, ILLNESS, RESTRICTION, BOON, BANE;
	}
		
	public static final Map<Integer, Condition> ConditionMap;
	
	private final ConditionFront front;
	
	private Condition(ConditionFront front, Expansion expansion) {
		super(front.getName(), expansion);
		
		this.front = front;
	}

	public final boolean isConditionType(ConditionFlags flag) {
		
		EnumSet<ConditionFlags> flags = this.front.getFlags();
		
		if (flags.contains(flag)) {
			return true;
		}
		
		return false;
	}
	
	static {
		
		Map<Integer, Condition> map = new HashMap<Integer, Condition>();
		
		Connection conn = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			
			conn = DriverManager.getConnection(DatabaseHandler.DATABASE_URL);
			statement = conn.prepareStatement("SELECT * FROM ConditionFront");
			resultSet = statement.executeQuery();
			
			while (resultSet.next()) {
				
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String strFlags = resultSet.getString(3);
				
				String[] arrFlags = strFlags.split(" ");				
				EnumSet<ConditionFlags> setFlags = EnumSet.noneOf(ConditionFlags.class);
				for (String str : arrFlags) {
					setFlags.add(ConditionFlags.valueOf(str));
				}
				
				map.put(id, new Condition( new ConditionFront(name, setFlags), Expansion.VANILLA ));
			
			}
			 	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DatabaseHandler.close(resultSet);
			DatabaseHandler.close(statement);
			DatabaseHandler.close(conn);
		}
		
		ConditionMap = Collections.unmodifiableMap(map);
		
	}

}
