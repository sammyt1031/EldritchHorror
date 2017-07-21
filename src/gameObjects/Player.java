package gameObjects;

import java.sql.*;
import java.util.*;

import gameObjects.gameTokens.*;
import utilities.*;

public final class Player {
	
	private int heroID;
	
	private final List<Integer> spellList = new ArrayList<Integer>();
	private final List<Integer> assetList = new ArrayList<Integer>();
	private final List<Integer> artifactList = new ArrayList<Integer>();
	private final List<Integer> conditionList = new ArrayList<Integer>();
	private final List<TicketType> ticketsList = new ArrayList<TicketType>(Constants.MAX_TICKETS_PER_PLAYER);
	
	private int currHealth;
	private int currSanity;
	private int currLore;
	private int currInf;
	private int currObs;
	private int currStr;
	private int currWill;
	
	private int currLocID;
	private int numClues = 0;	
	private int actionsLeft = Constants.MAX_NUM_ACTIONS;
	private boolean isLeadInv = false;

	public Player(int heroID) {
		this.heroID = heroID;
		
		Hero hero = Hero.HeroMap.get(this.heroID);
		
		this.currHealth = hero.getMaxHlth();
		this.currSanity = hero.getMaxSan();
		this.currLore = hero.getBaseLore();
		this.currInf = hero.getBaseInf();
		this.currObs = hero.getBaseObs();
		this.currStr = hero.getBaseStr();
		this.currWill = hero.getBaseWill();
		
		Connection conn = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			
			conn = DriverManager.getConnection(DatabaseHandler.DATABASE_URL);
			
			String str = String.format(	  "SELECT Locations.ID "
										+ "FROM Heroes "
										+ "INNER JOIN Locations "
										+ "ON Heroes.StartingLocation = Locations.Name "
										+ "AND Heroes.Name = '%s'", hero.getName());
			
			statement = conn.prepareStatement(str);
			resultSet = statement.executeQuery();
			
			/* There should only be one next() called */
			resultSet.next();
			this.currLocID = resultSet.getInt(1);		
			
			resultSet.next();
			if (!resultSet.isAfterLast()) {
				
				String bad = String.format("ERROR: Result Set found more than one match when querying starting location for %s\n", hero.getName());				
				do {
					bad += String.format("%d\n", resultSet.getInt(1));
				} while (resultSet.next());
				
				System.err.println(bad);
			}
			
			 	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DatabaseHandler.close(resultSet);
			DatabaseHandler.close(statement);
			DatabaseHandler.close(conn);
		}
		
	}
	
}
