package gameObjects.gameTokens;

import gameObjects.*;
import utilities.DatabaseHandler;

import java.sql.*;
import java.util.*;

public final class AncientOne extends GamePiece {
	
	public static final Map<Integer, AncientOne> AncientOneMap;

	public static final int MYTHOS_DECK_INIT_DIM_SIZE = 3;

	private final int doomStart_;
	private final List<List<Integer>> mythosInit_;
	
	private AncientOne (String name, Expansion expansion, int doomStart, String stageI, String stageII, String stageIII) {
		super(name, expansion);
		doomStart_ = doomStart;
		
		Scanner scannerI = new Scanner(stageI);
		Scanner scannerII = new Scanner(stageII);
		Scanner scannerIII = new Scanner(stageIII);
		
		List<Integer> listI = new ArrayList<Integer>(MYTHOS_DECK_INIT_DIM_SIZE);			
		List<Integer> listII = new ArrayList<Integer>(MYTHOS_DECK_INIT_DIM_SIZE);			
		List<Integer> listIII = new ArrayList<Integer>(MYTHOS_DECK_INIT_DIM_SIZE);			

		for (int i = 0; i < MYTHOS_DECK_INIT_DIM_SIZE; i++) {
			listI.add(scannerI.nextInt());
			listII.add(scannerII.nextInt());
			listIII.add(scannerIII.nextInt());
		}		
				
		scannerI.close();
		scannerII.close();
		scannerIII.close();
		
		ArrayList<List<Integer>> listOfLists = new ArrayList<List<Integer>>(MYTHOS_DECK_INIT_DIM_SIZE);		
		listOfLists.add(Collections.unmodifiableList(listI));
		listOfLists.add(Collections.unmodifiableList(listII));
		listOfLists.add(Collections.unmodifiableList(listIII));

		mythosInit_ = Collections.unmodifiableList(listOfLists);
	}
	
	/**
	 * @return the doomStart_
	 */
	public final int getDoomStart_ () {
		return doomStart_;
	}

	/**
	 * @return the mythosInit_
	 */
	public final List<List<Integer>> getMythosInit_ () {
		return mythosInit_;
	}
	
	static {
		
		Map<Integer, AncientOne> map = new HashMap<Integer, AncientOne>();
		
		Connection conn = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			
			conn = DriverManager.getConnection(DatabaseHandler.DATABASE_URL);
			statement = conn.prepareStatement("SELECT * FROM AncientOnes");
			resultSet = statement.executeQuery();
			
			while (resultSet.next()) {
				
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String expansion = resultSet.getString(3);
				int doomStart = resultSet.getInt(4);
				String mythosStageI = resultSet.getString(5);
				String mythosStageII = resultSet.getString(6);
				String mythosStageIII = resultSet.getString(7);
				
				map.put(id, new AncientOne( name, Expansion.valueOf(expansion), doomStart, mythosStageI, mythosStageII, mythosStageIII ));
			
			}
			 	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DatabaseHandler.close(resultSet);
			DatabaseHandler.close(statement);
			DatabaseHandler.close(conn);
		}
		
		AncientOneMap = Collections.unmodifiableMap(map);
		
	}
}