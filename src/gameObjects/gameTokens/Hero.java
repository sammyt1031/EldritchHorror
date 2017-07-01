package gameObjects.gameTokens;

import java.sql.*;
import java.util.*;

import database.DatabaseHandler;
import gameObjects.*;

public final class Hero extends GamePiece {
	
	public static final Map<Integer, Hero> HeroMap;
	
	private final int maxHlth;
	private final int maxSan;
	private final int baseLore;
	private final int baseInf;
	private final int baseObs;
	private final int baseStr;
	private final int baseWill;
	
	private Hero( String name, int maxHlth, int maxSan, int baseLore, int baseInf, int baseObs, int baseStr, int baseWill) {		
		super(name, Expansion.VANILLA);
		
		this.maxHlth = maxHlth;
		this.maxSan = maxSan;
		this.baseLore = baseLore;
		this.baseInf = baseInf;
		this.baseObs = baseObs;
		this.baseStr = baseStr;
		this.baseWill = baseWill;
				
	}
	
	/**
	 * @return the maxHlth
	 */
	public final int getMaxHlth() {
		return this.maxHlth;
	}
	/**
	 * @return the maxSan
	 */
	public final int getMaxSan() {
		return maxSan;
	}
	/**
	 * @return the baseLore
	 */
	public final int getBaseLore() {
		return baseLore;
	}
	/**
	 * @return the baseInf
	 */
	public final int getBaseInf() {
		return baseInf;
	}
	/**
	 * @return the baseObs
	 */
	public final int getBaseObs() {
		return baseObs;
	}
	/**
	 * @return the baseStr
	 */
	public final int getBaseStr() {
		return baseStr;
	}
	/**
	 * @return the baseWill
	 */
	public final int getBaseWill() {
		return baseWill;
	}
	
	static {
		
		Map<Integer, Hero> map = new HashMap<Integer, Hero>();
		
		Connection conn = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			
			conn = DriverManager.getConnection(DatabaseHandler.DATABASE_URL);
			statement = conn.prepareStatement("SELECT * FROM Heroes");
			resultSet = statement.executeQuery();
			
			while (resultSet.next()) {
				
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				int maxHealth = resultSet.getInt(3);
				int maxSanity = resultSet.getInt(4);
				int baseLore = resultSet.getInt(5);
				int baseInf = resultSet.getInt(6);
				int baseObs = resultSet.getInt(7);
				int baseStr = resultSet.getInt(8);
				int baseWill = resultSet.getInt(9);
				
				map.put(id, new Hero(name, maxHealth, maxSanity, baseLore, baseInf, baseObs, baseStr, baseWill));
			
			}
			 	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DatabaseHandler.close(resultSet);
			DatabaseHandler.close(statement);
			DatabaseHandler.close(conn);
		}
		
		HeroMap = Collections.unmodifiableMap(map);
		
	}
	
}
