package gameObjects.locationData;

import java.util.*;

import gameObjects.*;

public enum LocationID {
			
	SPACE1( 		"Space 1",				LocationType.CITY		),
	SPACE2( 		"Space 2",				LocationType.SEA		),
	SPACE3( 		"Space 3",				LocationType.SEA		),	
	SPACE4( 		"Space 4",				LocationType.WILDERNESS	),
	SPACE5( 		"Space 5",				LocationType.CITY		),
	SPACE6( 		"Space 6",				LocationType.CITY		),
	SPACE7( 		"Space 7",				LocationType.CITY		),
	SPACE8( 		"Space 8",				LocationType.SEA		),
	SPACE9( 		"Space 9",				LocationType.WILDERNESS	),
	SPACE10( 		"Space 10",				LocationType.WILDERNESS	),
	SPACE11( 		"Space 11",				LocationType.SEA		),
	SPACE12( 		"Space 12",				LocationType.SEA		),
	SPACE13( 		"Space 13",				LocationType.SEA		),
	SPACE14( 		"Space 14",				LocationType.CITY		),
	SPACE15( 		"Space 15",				LocationType.CITY		),
	SPACE16( 		"Space 16",				LocationType.CITY		),
	SPACE17( 		"Space 17",				LocationType.CITY		),
	SPACE18( 		"Space 18",				LocationType.SEA		),
	SPACE19( 		"Space 19",				LocationType.WILDERNESS	),
	SPACE20( 		"Space 20",				LocationType.CITY		),
	SPACE21( 		"Space 21",				LocationType.WILDERNESS	),
	SAN_FRAN( 		"San Francisco",		LocationType.CITY		),
	ARKHAM( 		"Arkham",				LocationType.CITY		),
	BUENOS_AIRES( 	"Buenos Aires",			LocationType.CITY		),
	LONDON( 		"London",				LocationType.CITY		),
	ROME( 			"Rome",					LocationType.CITY		),
	ISTANBUL( 		"Istanbul",				LocationType.CITY		),
	SHANGHAI( 		"Shanghai",				LocationType.CITY		),
	TOKYO( 			"Tokyo",				LocationType.CITY		),
	SYDNEY( 		"Sydney",				LocationType.CITY		),
	AMAZON( 		"The Amazon",			LocationType.WILDERNESS	),
	PYRAMIDS( 		"The Pyramids",			LocationType.WILDERNESS	),
	AFRICA( 		"The Heart of Africa",	LocationType.WILDERNESS	),
	ANTARCTICA( 	"Antarctica",			LocationType.SEA		),
	TUNGUSKA( 		"Tunguska",				LocationType.WILDERNESS	),
	HIMILAYAS( 		"The Himalayas",		LocationType.WILDERNESS	);
	
	private final Location location_;

	private LocationID(String name, LocationType locType) {
		location_ = new Location(name, locType);
	}
		
	public final Location getLocation_() {
		return location_;
	}
	
	public final class Location extends GamePiece {

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
		 * @return an unmodifiable version of the single final reference to the path list of this location
		 */
		public final List<Path> getPaths_() {
			return Collections.unmodifiableList(paths_);
		}
		
	}
	
	/**
	 * The following static initialization block sets up all paths_ from any location to all other possible locations
	 * */		
	static {

		SPACE1.location_.paths_.add(new Path(LocationID.SPACE4, PathType.UNCHARTED));
		SPACE1.location_.paths_.add(new Path(LocationID.SPACE19, PathType.SHIP));
		SPACE1.location_.paths_.add(new Path(LocationID.SAN_FRAN, PathType.SHIP));
		
		SPACE2.location_.paths_.add(new Path(LocationID.SAN_FRAN, PathType.SHIP));
		SPACE2.location_.paths_.add(new Path(LocationID.TOKYO, PathType.SHIP));
		
		SPACE3.location_.paths_.add(new Path(LocationID.BUENOS_AIRES, PathType.SHIP));
		SPACE3.location_.paths_.add(new Path(LocationID.SYDNEY, PathType.SHIP));

		SPACE4.location_.paths_.add(new Path(LocationID.SPACE1, PathType.UNCHARTED));
		SPACE4.location_.paths_.add(new Path(LocationID.SPACE5, PathType.UNCHARTED));

		SPACE5.location_.paths_.add(new Path(LocationID.SPACE4, PathType.UNCHARTED));
		SPACE5.location_.paths_.add(new Path(LocationID.SAN_FRAN, PathType.TRAIN));
		SPACE5.location_.paths_.add(new Path(LocationID.ARKHAM, PathType.TRAIN));

		SPACE6.location_.paths_.add(new Path(LocationID.SPACE7, PathType.TRAIN));
		SPACE6.location_.paths_.add(new Path(LocationID.SAN_FRAN, PathType.TRAIN));
		SPACE6.location_.paths_.add(new Path(LocationID.ARKHAM, PathType.TRAIN));

		SPACE7.location_.paths_.add(new Path(LocationID.SPACE6, PathType.TRAIN));
		SPACE7.location_.paths_.add(new Path(LocationID.SPACE8, PathType.SHIP));
		SPACE7.location_.paths_.add(new Path(LocationID.SAN_FRAN, PathType.SHIP));
		SPACE7.location_.paths_.add(new Path(LocationID.BUENOS_AIRES, PathType.SHIP));
		SPACE7.location_.paths_.add(new Path(LocationID.AMAZON, PathType.UNCHARTED));

		SPACE8.location_.paths_.add(new Path(LocationID.SPACE7, PathType.SHIP));
		SPACE8.location_.paths_.add(new Path(LocationID.SPACE10, PathType.SHIP));
		SPACE8.location_.paths_.add(new Path(LocationID.ARKHAM, PathType.SHIP));
		SPACE8.location_.paths_.add(new Path(LocationID.BUENOS_AIRES, PathType.SHIP));

		SPACE9.location_.paths_.add(new Path(LocationID.ARKHAM, PathType.SHIP));

		SPACE10.location_.paths_.add(new Path(LocationID.SPACE8, PathType.SHIP));
		SPACE10.location_.paths_.add(new Path(LocationID.SPACE15, PathType.SHIP));
		SPACE10.location_.paths_.add(new Path(LocationID.ROME, PathType.SHIP));
		SPACE10.location_.paths_.add(new Path(LocationID.PYRAMIDS, PathType.UNCHARTED));

		SPACE11.location_.paths_.add(new Path(LocationID.SPACE15, PathType.SHIP));
		SPACE11.location_.paths_.add(new Path(LocationID.BUENOS_AIRES, PathType.SHIP));

		SPACE12.location_.paths_.add(new Path(LocationID.BUENOS_AIRES, PathType.SHIP));
		SPACE12.location_.paths_.add(new Path(LocationID.ANTARCTICA, PathType.SHIP));

		SPACE13.location_.paths_.add(new Path(LocationID.LONDON, PathType.SHIP));

		SPACE14.location_.paths_.add(new Path(LocationID.SPACE16, PathType.TRAIN));
		SPACE14.location_.paths_.add(new Path(LocationID.ROME, PathType.TRAIN));
		
		SPACE15.location_.paths_.add(new Path(LocationID.SPACE10, PathType.SHIP));
		SPACE15.location_.paths_.add(new Path(LocationID.SPACE11, PathType.SHIP));
		SPACE15.location_.paths_.add(new Path(LocationID.SPACE17, PathType.SHIP));
		SPACE15.location_.paths_.add(new Path(LocationID.SPACE18, PathType.SHIP));
		SPACE15.location_.paths_.add(new Path(LocationID.AFRICA, PathType.UNCHARTED));

		SPACE16.location_.paths_.add(new Path(LocationID.SPACE14, PathType.TRAIN));
		SPACE16.location_.paths_.add(new Path(LocationID.ISTANBUL, PathType.TRAIN));
		SPACE16.location_.paths_.add(new Path(LocationID.TUNGUSKA, PathType.TRAIN));

		SPACE17.location_.paths_.add(new Path(LocationID.SPACE15, PathType.SHIP));
		SPACE17.location_.paths_.add(new Path(LocationID.SPACE20, PathType.SHIP));
		SPACE17.location_.paths_.add(new Path(LocationID.ISTANBUL, PathType.TRAIN));
		SPACE17.location_.paths_.add(new Path(LocationID.SHANGHAI, PathType.TRAIN));
		SPACE17.location_.paths_.add(new Path(LocationID.HIMILAYAS, PathType.UNCHARTED));

		SPACE18.location_.paths_.add(new Path(LocationID.SPACE15, PathType.SHIP));
		SPACE18.location_.paths_.add(new Path(LocationID.SYDNEY, PathType.SHIP));

		SPACE19.location_.paths_.add(new Path(LocationID.SPACE1, PathType.SHIP));
		SPACE19.location_.paths_.add(new Path(LocationID.SHANGHAI, PathType.TRAIN));
		SPACE19.location_.paths_.add(new Path(LocationID.TOKYO, PathType.SHIP));
		SPACE19.location_.paths_.add(new Path(LocationID.TUNGUSKA, PathType.TRAIN));

		SPACE20.location_.paths_.add(new Path(LocationID.SPACE17, PathType.SHIP));
		SPACE20.location_.paths_.add(new Path(LocationID.SHANGHAI, PathType.SHIP));
		SPACE20.location_.paths_.add(new Path(LocationID.TOKYO, PathType.SHIP));
		SPACE20.location_.paths_.add(new Path(LocationID.SYDNEY, PathType.SHIP));

		SPACE21.location_.paths_.add(new Path(LocationID.SYDNEY, PathType.UNCHARTED));
		
		SAN_FRAN.location_.paths_.add(new Path(LocationID.SPACE1, PathType.SHIP));
		SAN_FRAN.location_.paths_.add(new Path(LocationID.SPACE2, PathType.SHIP));
		SAN_FRAN.location_.paths_.add(new Path(LocationID.SPACE5, PathType.TRAIN));
		SAN_FRAN.location_.paths_.add(new Path(LocationID.SPACE6, PathType.TRAIN));
		SAN_FRAN.location_.paths_.add(new Path(LocationID.SPACE7, PathType.SHIP));

		ARKHAM.location_.paths_.add(new Path(LocationID.SPACE5, PathType.TRAIN));
		ARKHAM.location_.paths_.add(new Path(LocationID.SPACE6, PathType.TRAIN));
		ARKHAM.location_.paths_.add(new Path(LocationID.SPACE8, PathType.SHIP));
		ARKHAM.location_.paths_.add(new Path(LocationID.SPACE9, PathType.SHIP));
		ARKHAM.location_.paths_.add(new Path(LocationID.LONDON, PathType.SHIP));

		BUENOS_AIRES.location_.paths_.add(new Path(LocationID.SPACE3, PathType.SHIP));
		BUENOS_AIRES.location_.paths_.add(new Path(LocationID.SPACE7, PathType.SHIP));
		BUENOS_AIRES.location_.paths_.add(new Path(LocationID.SPACE8, PathType.SHIP));
		BUENOS_AIRES.location_.paths_.add(new Path(LocationID.SPACE11, PathType.SHIP));
		BUENOS_AIRES.location_.paths_.add(new Path(LocationID.SPACE12, PathType.SHIP));
		BUENOS_AIRES.location_.paths_.add(new Path(LocationID.AMAZON, PathType.UNCHARTED));

		LONDON.location_.paths_.add(new Path(LocationID.SPACE13, PathType.SHIP));
		LONDON.location_.paths_.add(new Path(LocationID.ROME, PathType.SHIP));
		LONDON.location_.paths_.add(new Path(LocationID.ARKHAM, PathType.SHIP));

		ROME.location_.paths_.add(new Path(LocationID.SPACE10, PathType.SHIP));
		ROME.location_.paths_.add(new Path(LocationID.SPACE14, PathType.TRAIN));
		ROME.location_.paths_.add(new Path(LocationID.LONDON, PathType.SHIP));
		ROME.location_.paths_.add(new Path(LocationID.ISTANBUL, PathType.TRAIN));
		ROME.location_.paths_.add(new Path(LocationID.PYRAMIDS, PathType.SHIP));

		ISTANBUL.location_.paths_.add(new Path(LocationID.SPACE16, PathType.TRAIN));
		ISTANBUL.location_.paths_.add(new Path(LocationID.SPACE17, PathType.TRAIN));
		ISTANBUL.location_.paths_.add(new Path(LocationID.ROME, PathType.TRAIN));
		ISTANBUL.location_.paths_.add(new Path(LocationID.PYRAMIDS, PathType.TRAIN));

		SHANGHAI.location_.paths_.add(new Path(LocationID.SPACE17, PathType.TRAIN));
		SHANGHAI.location_.paths_.add(new Path(LocationID.SPACE19, PathType.TRAIN));
		SHANGHAI.location_.paths_.add(new Path(LocationID.SPACE20, PathType.SHIP));
		SHANGHAI.location_.paths_.add(new Path(LocationID.TOKYO, PathType.SHIP));
		SHANGHAI.location_.paths_.add(new Path(LocationID.HIMILAYAS, PathType.UNCHARTED));

		TOKYO.location_.paths_.add(new Path(LocationID.SPACE2, PathType.SHIP));
		TOKYO.location_.paths_.add(new Path(LocationID.SPACE19, PathType.SHIP));
		TOKYO.location_.paths_.add(new Path(LocationID.SPACE20, PathType.SHIP));
		TOKYO.location_.paths_.add(new Path(LocationID.SHANGHAI, PathType.SHIP));

		SYDNEY.location_.paths_.add(new Path(LocationID.SPACE3, PathType.SHIP));
		SYDNEY.location_.paths_.add(new Path(LocationID.SPACE18, PathType.SHIP));
		SYDNEY.location_.paths_.add(new Path(LocationID.SPACE20, PathType.SHIP));
		SYDNEY.location_.paths_.add(new Path(LocationID.SPACE21, PathType.UNCHARTED));
		SYDNEY.location_.paths_.add(new Path(LocationID.ANTARCTICA, PathType.SHIP));

		AMAZON.location_.paths_.add(new Path(LocationID.SPACE7, PathType.UNCHARTED));
		AMAZON.location_.paths_.add(new Path(LocationID.BUENOS_AIRES, PathType.UNCHARTED));

		PYRAMIDS.location_.paths_.add(new Path(LocationID.SPACE10, PathType.UNCHARTED));
		PYRAMIDS.location_.paths_.add(new Path(LocationID.ROME, PathType.SHIP));
		PYRAMIDS.location_.paths_.add(new Path(LocationID.ISTANBUL, PathType.TRAIN));
		PYRAMIDS.location_.paths_.add(new Path(LocationID.AFRICA, PathType.UNCHARTED));

		AFRICA.location_.paths_.add(new Path(LocationID.SPACE15, PathType.UNCHARTED));
		AFRICA.location_.paths_.add(new Path(LocationID.PYRAMIDS, PathType.UNCHARTED));

		ANTARCTICA.location_.paths_.add(new Path(LocationID.SPACE12, PathType.SHIP));
		ANTARCTICA.location_.paths_.add(new Path(LocationID.SYDNEY, PathType.SHIP));

		TUNGUSKA.location_.paths_.add(new Path(LocationID.SPACE16, PathType.TRAIN));
		TUNGUSKA.location_.paths_.add(new Path(LocationID.SPACE19, PathType.TRAIN));

		HIMILAYAS.location_.paths_.add(new Path(LocationID.SPACE17, PathType.UNCHARTED));
		HIMILAYAS.location_.paths_.add(new Path(LocationID.SHANGHAI, PathType.UNCHARTED));		

	}
	
}