package gameObjects.locationData;

import java.util.*;

import gameObjects.Expansion;
import gameObjects.GamePiece;

public final class Location extends GamePiece {

	static final Location Space1 = new Location(		"Space 1",				LocationType.CITY			);
	static final Location Space2 = new Location(		"Space 2",				LocationType.SEA			);
	static final Location Space3 = new Location(		"Space 3",				LocationType.SEA			);	
	static final Location Space4 = new Location(		"Space 4",				LocationType.WILDERNESS		);
	static final Location Space5 = new Location(		"Space 5",				LocationType.CITY			);
	static final Location Space6 = new Location(		"Space 6",				LocationType.CITY			);
	static final Location Space7 = new Location(		"Space 7",				LocationType.CITY			);
	static final Location Space8 = new Location(		"Space 8",				LocationType.SEA			);
	static final Location Space9 = new Location(		"Space 9",				LocationType.WILDERNESS		);
	static final Location Space10 = new Location(		"Space 10",				LocationType.WILDERNESS		);
	static final Location Space11 = new Location(		"Space 11",				LocationType.SEA			);
	static final Location Space12 = new Location(		"Space 12",				LocationType.SEA			);
	static final Location Space13 = new Location(		"Space 13",				LocationType.SEA			);
	static final Location Space14 = new Location(		"Space 14",				LocationType.CITY			);
	static final Location Space15 = new Location(		"Space 15",				LocationType.CITY			);
	static final Location Space16 = new Location(		"Space 16",				LocationType.CITY			);
	static final Location Space17 = new Location(		"Space 17",				LocationType.CITY			);
	static final Location Space18 = new Location(		"Space 18",				LocationType.SEA			);
	static final Location Space19 = new Location(		"Space 19",				LocationType.WILDERNESS		);
	static final Location Space20 = new Location(		"Space 20",				LocationType.CITY			);
	static final Location Space21 = new Location(		"Space 21",				LocationType.WILDERNESS		);
	static final Location San_Fran = new Location(		"San Francisco",		LocationType.CITY			);
	static final Location Arkham = new Location(		"Arkham",				LocationType.CITY			);
	static final Location Buenos_Aires = new Location(	"Buenos Aires",			LocationType.CITY			);
	static final Location London = new Location(		"London",				LocationType.CITY			);
	static final Location Rome = new Location(			"Rome",					LocationType.CITY			);
	static final Location Istanbul = new Location(		"Istanbul",				LocationType.CITY			);
	static final Location Shanghai = new Location(		"Shanghai",				LocationType.CITY			);
	static final Location Tokyo = new Location(			"Tokyo",				LocationType.CITY			);
	static final Location Sydney = new Location(		"Sydney",				LocationType.CITY			);
	static final Location Amazon = new Location(		"The Amazon",			LocationType.WILDERNESS		);
	static final Location Pyramids = new Location(		"The Pyramids",			LocationType.WILDERNESS		);
	static final Location Africa = new Location(		"The Heart of Africa",	LocationType.WILDERNESS		);
	static final Location Antarctica = new Location(	"Antarctica",			LocationType.SEA			);
	static final Location Tunguska = new Location(		"Tunguska",				LocationType.WILDERNESS		);
	static final Location Himilayas = new Location(		"The Himalayas",		LocationType.WILDERNESS		);

	
	private final LocationType locType_;
	private final List<Path> paths_;
	
	private Location(String name, LocationType locType) {
		super(name, Expansion.VANILLA);
		locType_ = locType;
		paths_ = new ArrayList<Path>();
	}

	/**
	 * @return the locType_
	 */
	public final LocationType getLocType_() {
		return locType_;
	}
		
	/**
	 * @return the paths_
	 */
	public final List<Path> getPaths_() {
		return paths_;
	}

	/**
	 * The following static initialization block sets up all paths_ from any location to all other possible locations
	 * */
	static {

		Space1.paths_.add(new Path(LocationID.SPACE4, PathType.UNCHARTED));
		Space1.paths_.add(new Path(LocationID.SPACE19, PathType.SHIP));
		Space1.paths_.add(new Path(LocationID.SAN_FRAN, PathType.SHIP));
		
		Space2.paths_.add(new Path(LocationID.SAN_FRAN, PathType.SHIP));
		Space2.paths_.add(new Path(LocationID.TOKYO, PathType.SHIP));
		
		Space3.paths_.add(new Path(LocationID.BUENOS_AIRES, PathType.SHIP));
		Space3.paths_.add(new Path(LocationID.SYDNEY, PathType.SHIP));

		Space4.paths_.add(new Path(LocationID.SPACE1, PathType.UNCHARTED));
		Space4.paths_.add(new Path(LocationID.SPACE5, PathType.UNCHARTED));

		Space5.paths_.add(new Path(LocationID.SPACE4, PathType.UNCHARTED));
		Space5.paths_.add(new Path(LocationID.SAN_FRAN, PathType.TRAIN));
		Space5.paths_.add(new Path(LocationID.ARKHAM, PathType.TRAIN));

		Space6.paths_.add(new Path(LocationID.SPACE7, PathType.TRAIN));
		Space6.paths_.add(new Path(LocationID.SAN_FRAN, PathType.TRAIN));
		Space6.paths_.add(new Path(LocationID.ARKHAM, PathType.TRAIN));

		Space7.paths_.add(new Path(LocationID.SPACE6, PathType.TRAIN));
		Space7.paths_.add(new Path(LocationID.SPACE8, PathType.SHIP));
		Space7.paths_.add(new Path(LocationID.SAN_FRAN, PathType.SHIP));
		Space7.paths_.add(new Path(LocationID.BUENOS_AIRES, PathType.SHIP));
		Space7.paths_.add(new Path(LocationID.AMAZON, PathType.UNCHARTED));

		Space8.paths_.add(new Path(LocationID.SPACE7, PathType.SHIP));
		Space8.paths_.add(new Path(LocationID.SPACE10, PathType.SHIP));
		Space8.paths_.add(new Path(LocationID.ARKHAM, PathType.SHIP));
		Space8.paths_.add(new Path(LocationID.BUENOS_AIRES, PathType.SHIP));

		Space9.paths_.add(new Path(LocationID.ARKHAM, PathType.SHIP));

		Space10.paths_.add(new Path(LocationID.SPACE8, PathType.SHIP));
		Space10.paths_.add(new Path(LocationID.SPACE15, PathType.SHIP));
		Space10.paths_.add(new Path(LocationID.ROME, PathType.SHIP));
		Space10.paths_.add(new Path(LocationID.PYRAMIDS, PathType.UNCHARTED));

		Space11.paths_.add(new Path(LocationID.SPACE15, PathType.SHIP));
		Space11.paths_.add(new Path(LocationID.BUENOS_AIRES, PathType.SHIP));

		Space12.paths_.add(new Path(LocationID.BUENOS_AIRES, PathType.SHIP));
		Space12.paths_.add(new Path(LocationID.ANTARCTICA, PathType.SHIP));

		Space13.paths_.add(new Path(LocationID.LONDON, PathType.SHIP));

		Space14.paths_.add(new Path(LocationID.SPACE16, PathType.TRAIN));
		Space14.paths_.add(new Path(LocationID.ROME, PathType.TRAIN));
		
		Space15.paths_.add(new Path(LocationID.SPACE10, PathType.SHIP));
		Space15.paths_.add(new Path(LocationID.SPACE11, PathType.SHIP));
		Space15.paths_.add(new Path(LocationID.SPACE17, PathType.SHIP));
		Space15.paths_.add(new Path(LocationID.SPACE18, PathType.SHIP));
		Space15.paths_.add(new Path(LocationID.AFRICA, PathType.UNCHARTED));

		Space16.paths_.add(new Path(LocationID.SPACE14, PathType.TRAIN));
		Space16.paths_.add(new Path(LocationID.ISTANBUL, PathType.TRAIN));
		Space16.paths_.add(new Path(LocationID.TUNGUSKA, PathType.TRAIN));

		Space17.paths_.add(new Path(LocationID.SPACE15, PathType.SHIP));
		Space17.paths_.add(new Path(LocationID.SPACE20, PathType.SHIP));
		Space17.paths_.add(new Path(LocationID.ISTANBUL, PathType.TRAIN));
		Space17.paths_.add(new Path(LocationID.SHANGHAI, PathType.TRAIN));
		Space17.paths_.add(new Path(LocationID.HIMILAYAS, PathType.UNCHARTED));

		Space18.paths_.add(new Path(LocationID.SPACE15, PathType.SHIP));
		Space18.paths_.add(new Path(LocationID.SYDNEY, PathType.SHIP));

		Space19.paths_.add(new Path(LocationID.SPACE1, PathType.SHIP));
		Space19.paths_.add(new Path(LocationID.SHANGHAI, PathType.TRAIN));
		Space19.paths_.add(new Path(LocationID.TOKYO, PathType.SHIP));
		Space19.paths_.add(new Path(LocationID.TUNGUSKA, PathType.TRAIN));

		Space20.paths_.add(new Path(LocationID.SPACE17, PathType.SHIP));
		Space20.paths_.add(new Path(LocationID.SHANGHAI, PathType.SHIP));
		Space20.paths_.add(new Path(LocationID.TOKYO, PathType.SHIP));
		Space20.paths_.add(new Path(LocationID.SYDNEY, PathType.SHIP));

		Space21.paths_.add(new Path(LocationID.SYDNEY, PathType.UNCHARTED));
		
		San_Fran.paths_.add(new Path(LocationID.SPACE1, PathType.SHIP));
		San_Fran.paths_.add(new Path(LocationID.SPACE2, PathType.SHIP));
		San_Fran.paths_.add(new Path(LocationID.SPACE5, PathType.TRAIN));
		San_Fran.paths_.add(new Path(LocationID.SPACE6, PathType.TRAIN));
		San_Fran.paths_.add(new Path(LocationID.SPACE7, PathType.SHIP));

		Arkham.paths_.add(new Path(LocationID.SPACE5, PathType.TRAIN));
		Arkham.paths_.add(new Path(LocationID.SPACE6, PathType.TRAIN));
		Arkham.paths_.add(new Path(LocationID.SPACE8, PathType.SHIP));
		Arkham.paths_.add(new Path(LocationID.SPACE9, PathType.SHIP));
		Arkham.paths_.add(new Path(LocationID.LONDON, PathType.SHIP));

		Buenos_Aires.paths_.add(new Path(LocationID.SPACE3, PathType.SHIP));
		Buenos_Aires.paths_.add(new Path(LocationID.SPACE7, PathType.SHIP));
		Buenos_Aires.paths_.add(new Path(LocationID.SPACE8, PathType.SHIP));
		Buenos_Aires.paths_.add(new Path(LocationID.SPACE11, PathType.SHIP));
		Buenos_Aires.paths_.add(new Path(LocationID.SPACE12, PathType.SHIP));
		Buenos_Aires.paths_.add(new Path(LocationID.AMAZON, PathType.UNCHARTED));

		London.paths_.add(new Path(LocationID.SPACE13, PathType.SHIP));
		London.paths_.add(new Path(LocationID.ROME, PathType.SHIP));
		London.paths_.add(new Path(LocationID.ARKHAM, PathType.SHIP));

		Rome.paths_.add(new Path(LocationID.SPACE10, PathType.SHIP));
		Rome.paths_.add(new Path(LocationID.SPACE14, PathType.TRAIN));
		Rome.paths_.add(new Path(LocationID.LONDON, PathType.SHIP));
		Rome.paths_.add(new Path(LocationID.ISTANBUL, PathType.TRAIN));
		Rome.paths_.add(new Path(LocationID.PYRAMIDS, PathType.SHIP));

		Istanbul.paths_.add(new Path(LocationID.SPACE16, PathType.TRAIN));
		Istanbul.paths_.add(new Path(LocationID.SPACE17, PathType.TRAIN));
		Istanbul.paths_.add(new Path(LocationID.ROME, PathType.TRAIN));
		Istanbul.paths_.add(new Path(LocationID.PYRAMIDS, PathType.TRAIN));

		Shanghai.paths_.add(new Path(LocationID.SPACE17, PathType.TRAIN));
		Shanghai.paths_.add(new Path(LocationID.SPACE19, PathType.TRAIN));
		Shanghai.paths_.add(new Path(LocationID.SPACE20, PathType.SHIP));
		Shanghai.paths_.add(new Path(LocationID.TOKYO, PathType.SHIP));
		Shanghai.paths_.add(new Path(LocationID.HIMILAYAS, PathType.UNCHARTED));

		Tokyo.paths_.add(new Path(LocationID.SPACE2, PathType.SHIP));
		Tokyo.paths_.add(new Path(LocationID.SPACE19, PathType.SHIP));
		Tokyo.paths_.add(new Path(LocationID.SPACE20, PathType.SHIP));
		Tokyo.paths_.add(new Path(LocationID.SHANGHAI, PathType.SHIP));

		Sydney.paths_.add(new Path(LocationID.SPACE3, PathType.SHIP));
		Sydney.paths_.add(new Path(LocationID.SPACE18, PathType.SHIP));
		Sydney.paths_.add(new Path(LocationID.SPACE20, PathType.SHIP));
		Sydney.paths_.add(new Path(LocationID.SPACE21, PathType.UNCHARTED));
		Sydney.paths_.add(new Path(LocationID.ANTARCTICA, PathType.SHIP));

		Amazon.paths_.add(new Path(LocationID.SPACE7, PathType.UNCHARTED));
		Amazon.paths_.add(new Path(LocationID.BUENOS_AIRES, PathType.UNCHARTED));

		Pyramids.paths_.add(new Path(LocationID.SPACE10, PathType.UNCHARTED));
		Pyramids.paths_.add(new Path(LocationID.ROME, PathType.SHIP));
		Pyramids.paths_.add(new Path(LocationID.ISTANBUL, PathType.TRAIN));
		Pyramids.paths_.add(new Path(LocationID.AFRICA, PathType.UNCHARTED));

		Africa.paths_.add(new Path(LocationID.SPACE15, PathType.UNCHARTED));
		Africa.paths_.add(new Path(LocationID.PYRAMIDS, PathType.UNCHARTED));

		Antarctica.paths_.add(new Path(LocationID.SPACE12, PathType.SHIP));
		Antarctica.paths_.add(new Path(LocationID.SYDNEY, PathType.SHIP));

		Tunguska.paths_.add(new Path(LocationID.SPACE16, PathType.TRAIN));
		Tunguska.paths_.add(new Path(LocationID.SPACE19, PathType.TRAIN));

		Himilayas.paths_.add(new Path(LocationID.SPACE17, PathType.UNCHARTED));
		Himilayas.paths_.add(new Path(LocationID.SHANGHAI, PathType.UNCHARTED));

	}
	
}
