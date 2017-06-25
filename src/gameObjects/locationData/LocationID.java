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
	
	private final Location location;

	private LocationID(String name, LocationType locType) {
		this.location = new Location(name, locType);
	}
		
	/**
	 * @return the locType_
	 */
	public final LocationType getLocType() {
		return location.locType;
	}
		
	/**
	 * @return an unmodifiable version of the single final reference to the path list of this location
	 */
	public final List<Path> getPaths() {
		return Collections.unmodifiableList(location.paths);
	}
	
	public final class Location extends GamePiece {

		private final List<Path> paths = new ArrayList<Path>();
		private final LocationType locType;
		
		private Location(String name, LocationType locType) {
			super(name, Expansion.VANILLA);
			this.locType = locType;
		}
		
	}
	
	/**
	 * The following static initialization block sets up all paths from any location to all other possible locations
	 * */		
	static {

		SPACE1.location.paths.add(new Path(LocationID.SPACE4, PathType.UNCHARTED));
		SPACE1.location.paths.add(new Path(LocationID.SPACE19, PathType.SHIP));
		SPACE1.location.paths.add(new Path(LocationID.SAN_FRAN, PathType.SHIP));
		
		SPACE2.location.paths.add(new Path(LocationID.SAN_FRAN, PathType.SHIP));
		SPACE2.location.paths.add(new Path(LocationID.TOKYO, PathType.SHIP));
		
		SPACE3.location.paths.add(new Path(LocationID.BUENOS_AIRES, PathType.SHIP));
		SPACE3.location.paths.add(new Path(LocationID.SYDNEY, PathType.SHIP));

		SPACE4.location.paths.add(new Path(LocationID.SPACE1, PathType.UNCHARTED));
		SPACE4.location.paths.add(new Path(LocationID.SPACE5, PathType.UNCHARTED));

		SPACE5.location.paths.add(new Path(LocationID.SPACE4, PathType.UNCHARTED));
		SPACE5.location.paths.add(new Path(LocationID.SAN_FRAN, PathType.TRAIN));
		SPACE5.location.paths.add(new Path(LocationID.ARKHAM, PathType.TRAIN));

		SPACE6.location.paths.add(new Path(LocationID.SPACE7, PathType.TRAIN));
		SPACE6.location.paths.add(new Path(LocationID.SAN_FRAN, PathType.TRAIN));
		SPACE6.location.paths.add(new Path(LocationID.ARKHAM, PathType.TRAIN));

		SPACE7.location.paths.add(new Path(LocationID.SPACE6, PathType.TRAIN));
		SPACE7.location.paths.add(new Path(LocationID.SPACE8, PathType.SHIP));
		SPACE7.location.paths.add(new Path(LocationID.SAN_FRAN, PathType.SHIP));
		SPACE7.location.paths.add(new Path(LocationID.BUENOS_AIRES, PathType.SHIP));
		SPACE7.location.paths.add(new Path(LocationID.AMAZON, PathType.UNCHARTED));

		SPACE8.location.paths.add(new Path(LocationID.SPACE7, PathType.SHIP));
		SPACE8.location.paths.add(new Path(LocationID.SPACE10, PathType.SHIP));
		SPACE8.location.paths.add(new Path(LocationID.ARKHAM, PathType.SHIP));
		SPACE8.location.paths.add(new Path(LocationID.BUENOS_AIRES, PathType.SHIP));

		SPACE9.location.paths.add(new Path(LocationID.ARKHAM, PathType.SHIP));

		SPACE10.location.paths.add(new Path(LocationID.SPACE8, PathType.SHIP));
		SPACE10.location.paths.add(new Path(LocationID.SPACE15, PathType.SHIP));
		SPACE10.location.paths.add(new Path(LocationID.ROME, PathType.SHIP));
		SPACE10.location.paths.add(new Path(LocationID.PYRAMIDS, PathType.UNCHARTED));

		SPACE11.location.paths.add(new Path(LocationID.SPACE15, PathType.SHIP));
		SPACE11.location.paths.add(new Path(LocationID.BUENOS_AIRES, PathType.SHIP));

		SPACE12.location.paths.add(new Path(LocationID.BUENOS_AIRES, PathType.SHIP));
		SPACE12.location.paths.add(new Path(LocationID.ANTARCTICA, PathType.SHIP));

		SPACE13.location.paths.add(new Path(LocationID.LONDON, PathType.SHIP));

		SPACE14.location.paths.add(new Path(LocationID.SPACE16, PathType.TRAIN));
		SPACE14.location.paths.add(new Path(LocationID.ROME, PathType.TRAIN));
		
		SPACE15.location.paths.add(new Path(LocationID.SPACE10, PathType.SHIP));
		SPACE15.location.paths.add(new Path(LocationID.SPACE11, PathType.SHIP));
		SPACE15.location.paths.add(new Path(LocationID.SPACE17, PathType.SHIP));
		SPACE15.location.paths.add(new Path(LocationID.SPACE18, PathType.SHIP));
		SPACE15.location.paths.add(new Path(LocationID.AFRICA, PathType.UNCHARTED));

		SPACE16.location.paths.add(new Path(LocationID.SPACE14, PathType.TRAIN));
		SPACE16.location.paths.add(new Path(LocationID.ISTANBUL, PathType.TRAIN));
		SPACE16.location.paths.add(new Path(LocationID.TUNGUSKA, PathType.TRAIN));

		SPACE17.location.paths.add(new Path(LocationID.SPACE15, PathType.SHIP));
		SPACE17.location.paths.add(new Path(LocationID.SPACE20, PathType.SHIP));
		SPACE17.location.paths.add(new Path(LocationID.ISTANBUL, PathType.TRAIN));
		SPACE17.location.paths.add(new Path(LocationID.SHANGHAI, PathType.TRAIN));
		SPACE17.location.paths.add(new Path(LocationID.HIMILAYAS, PathType.UNCHARTED));

		SPACE18.location.paths.add(new Path(LocationID.SPACE15, PathType.SHIP));
		SPACE18.location.paths.add(new Path(LocationID.SYDNEY, PathType.SHIP));

		SPACE19.location.paths.add(new Path(LocationID.SPACE1, PathType.SHIP));
		SPACE19.location.paths.add(new Path(LocationID.SHANGHAI, PathType.TRAIN));
		SPACE19.location.paths.add(new Path(LocationID.TOKYO, PathType.SHIP));
		SPACE19.location.paths.add(new Path(LocationID.TUNGUSKA, PathType.TRAIN));

		SPACE20.location.paths.add(new Path(LocationID.SPACE17, PathType.SHIP));
		SPACE20.location.paths.add(new Path(LocationID.SHANGHAI, PathType.SHIP));
		SPACE20.location.paths.add(new Path(LocationID.TOKYO, PathType.SHIP));
		SPACE20.location.paths.add(new Path(LocationID.SYDNEY, PathType.SHIP));

		SPACE21.location.paths.add(new Path(LocationID.SYDNEY, PathType.UNCHARTED));
		
		SAN_FRAN.location.paths.add(new Path(LocationID.SPACE1, PathType.SHIP));
		SAN_FRAN.location.paths.add(new Path(LocationID.SPACE2, PathType.SHIP));
		SAN_FRAN.location.paths.add(new Path(LocationID.SPACE5, PathType.TRAIN));
		SAN_FRAN.location.paths.add(new Path(LocationID.SPACE6, PathType.TRAIN));
		SAN_FRAN.location.paths.add(new Path(LocationID.SPACE7, PathType.SHIP));

		ARKHAM.location.paths.add(new Path(LocationID.SPACE5, PathType.TRAIN));
		ARKHAM.location.paths.add(new Path(LocationID.SPACE6, PathType.TRAIN));
		ARKHAM.location.paths.add(new Path(LocationID.SPACE8, PathType.SHIP));
		ARKHAM.location.paths.add(new Path(LocationID.SPACE9, PathType.SHIP));
		ARKHAM.location.paths.add(new Path(LocationID.LONDON, PathType.SHIP));

		BUENOS_AIRES.location.paths.add(new Path(LocationID.SPACE3, PathType.SHIP));
		BUENOS_AIRES.location.paths.add(new Path(LocationID.SPACE7, PathType.SHIP));
		BUENOS_AIRES.location.paths.add(new Path(LocationID.SPACE8, PathType.SHIP));
		BUENOS_AIRES.location.paths.add(new Path(LocationID.SPACE11, PathType.SHIP));
		BUENOS_AIRES.location.paths.add(new Path(LocationID.SPACE12, PathType.SHIP));
		BUENOS_AIRES.location.paths.add(new Path(LocationID.AMAZON, PathType.UNCHARTED));

		LONDON.location.paths.add(new Path(LocationID.SPACE13, PathType.SHIP));
		LONDON.location.paths.add(new Path(LocationID.ROME, PathType.SHIP));
		LONDON.location.paths.add(new Path(LocationID.ARKHAM, PathType.SHIP));

		ROME.location.paths.add(new Path(LocationID.SPACE10, PathType.SHIP));
		ROME.location.paths.add(new Path(LocationID.SPACE14, PathType.TRAIN));
		ROME.location.paths.add(new Path(LocationID.LONDON, PathType.SHIP));
		ROME.location.paths.add(new Path(LocationID.ISTANBUL, PathType.TRAIN));
		ROME.location.paths.add(new Path(LocationID.PYRAMIDS, PathType.SHIP));

		ISTANBUL.location.paths.add(new Path(LocationID.SPACE16, PathType.TRAIN));
		ISTANBUL.location.paths.add(new Path(LocationID.SPACE17, PathType.TRAIN));
		ISTANBUL.location.paths.add(new Path(LocationID.ROME, PathType.TRAIN));
		ISTANBUL.location.paths.add(new Path(LocationID.PYRAMIDS, PathType.TRAIN));

		SHANGHAI.location.paths.add(new Path(LocationID.SPACE17, PathType.TRAIN));
		SHANGHAI.location.paths.add(new Path(LocationID.SPACE19, PathType.TRAIN));
		SHANGHAI.location.paths.add(new Path(LocationID.SPACE20, PathType.SHIP));
		SHANGHAI.location.paths.add(new Path(LocationID.TOKYO, PathType.SHIP));
		SHANGHAI.location.paths.add(new Path(LocationID.HIMILAYAS, PathType.UNCHARTED));

		TOKYO.location.paths.add(new Path(LocationID.SPACE2, PathType.SHIP));
		TOKYO.location.paths.add(new Path(LocationID.SPACE19, PathType.SHIP));
		TOKYO.location.paths.add(new Path(LocationID.SPACE20, PathType.SHIP));
		TOKYO.location.paths.add(new Path(LocationID.SHANGHAI, PathType.SHIP));

		SYDNEY.location.paths.add(new Path(LocationID.SPACE3, PathType.SHIP));
		SYDNEY.location.paths.add(new Path(LocationID.SPACE18, PathType.SHIP));
		SYDNEY.location.paths.add(new Path(LocationID.SPACE20, PathType.SHIP));
		SYDNEY.location.paths.add(new Path(LocationID.SPACE21, PathType.UNCHARTED));
		SYDNEY.location.paths.add(new Path(LocationID.ANTARCTICA, PathType.SHIP));

		AMAZON.location.paths.add(new Path(LocationID.SPACE7, PathType.UNCHARTED));
		AMAZON.location.paths.add(new Path(LocationID.BUENOS_AIRES, PathType.UNCHARTED));

		PYRAMIDS.location.paths.add(new Path(LocationID.SPACE10, PathType.UNCHARTED));
		PYRAMIDS.location.paths.add(new Path(LocationID.ROME, PathType.SHIP));
		PYRAMIDS.location.paths.add(new Path(LocationID.ISTANBUL, PathType.TRAIN));
		PYRAMIDS.location.paths.add(new Path(LocationID.AFRICA, PathType.UNCHARTED));

		AFRICA.location.paths.add(new Path(LocationID.SPACE15, PathType.UNCHARTED));
		AFRICA.location.paths.add(new Path(LocationID.PYRAMIDS, PathType.UNCHARTED));

		ANTARCTICA.location.paths.add(new Path(LocationID.SPACE12, PathType.SHIP));
		ANTARCTICA.location.paths.add(new Path(LocationID.SYDNEY, PathType.SHIP));

		TUNGUSKA.location.paths.add(new Path(LocationID.SPACE16, PathType.TRAIN));
		TUNGUSKA.location.paths.add(new Path(LocationID.SPACE19, PathType.TRAIN));

		HIMILAYAS.location.paths.add(new Path(LocationID.SPACE17, PathType.UNCHARTED));
		HIMILAYAS.location.paths.add(new Path(LocationID.SHANGHAI, PathType.UNCHARTED));		

	}
	
}