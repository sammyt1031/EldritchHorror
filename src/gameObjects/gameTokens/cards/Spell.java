package gameObjects.gameTokens.Cards;

import java.sql.*;
import java.util.*;

import database.DatabaseHandler;
import gameObjects.Expansion;

public final class Spell extends Card {

	public static enum Type {
		RITUAL, INCANTATION;
	}
	
	public static final Map<Integer, Spell> SpellMap;
	
	private final Type type;
	
	private Spell(String name, Expansion expansion, Type type) {
		super(name, expansion);
		
		this.type = type;
	}

	/**
	 * @return the type
	 */
	public final Type getType() {
		return type;
	}
	
	static {
		
		Map<Integer, Spell> map = new HashMap<Integer, Spell>();
		
		Connection conn = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			
			conn = DriverManager.getConnection(DatabaseHandler.DATABASE_URL);
			statement = conn.prepareStatement("SELECT * FROM SpellFront");
			resultSet = statement.executeQuery();
			
			while (resultSet.next()) {
				
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String spellType = resultSet.getString(3);
				
				map.put(id, new Spell(name, Expansion.VANILLA, Type.valueOf(spellType)));
			
			}
			 	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DatabaseHandler.close(resultSet);
			DatabaseHandler.close(statement);
			DatabaseHandler.close(conn);
		}
		
		SpellMap = Collections.unmodifiableMap(map);
		
	}

}
