package gameObjects.locationData;

import java.util.*;

//import gameObjects.locationData.*;
import gameObjects.locationData.Path.PathType;

public enum Location {
		
	SPACE1(			"Space 1",				LocationType.CITY			),
	SPACE2(			"Space 2",				LocationType.SEA			),
	SPACE3(			"Space 3",				LocationType.SEA			),
	SPACE4(			"Space 4",				LocationType.WILDERNESS		),
	SPACE5(			"Space 5",				LocationType.CITY			),
	SPACE6(			"Space 6",				LocationType.CITY			),
	SPACE7(			"Space 7",				LocationType.CITY			),
	SPACE8(			"Space 8",				LocationType.SEA			),
	SPACE9(			"Space 9",				LocationType.WILDERNESS		),
	SPACE10(		"Space 10",				LocationType.WILDERNESS		),
	SPACE11(		"Space 11",				LocationType.SEA			),
	SPACE12(		"Space 12",				LocationType.SEA			),
	SPACE13(		"Space 13",				LocationType.SEA			),
	SPACE14(		"Space 14",				LocationType.CITY			),
	SPACE15(		"Space 15",				LocationType.CITY			),
	SPACE16(		"Space 16",				LocationType.CITY			),
	SPACE17(		"Space 17",				LocationType.CITY			),
	SPACE18(		"Space 18",				LocationType.SEA			),
	SPACE19(		"Space 19",				LocationType.WILDERNESS		),
	SPACE20(		"Space 20",				LocationType.CITY			),
	SPACE21(		"Space 21",				LocationType.WILDERNESS		),
	SAN_FRAN(		"San Francisco",		LocationType.CITY			),
	ARKHAM(			"Arkham",				LocationType.CITY			),
	BUENOS_AIRES(	"Buenos Aires",			LocationType.CITY			),
	LONDON(			"London",				LocationType.CITY			),
	ROME(			"Rome",					LocationType.CITY			),
	ISTANBUL(		"Istanbul",				LocationType.CITY			),
	SHANGHAI(		"Shanghai",				LocationType.CITY			),
	TOKYO(			"Tokyo",				LocationType.CITY			),
	SYDNEY(			"Sydney",				LocationType.CITY			),
	AMAZON(			"The Amazon",			LocationType.WILDERNESS		),
	PYRAMIDS(		"The Pyramids",			LocationType.WILDERNESS		),
	AFRICA(			"The Heart of Africa",	LocationType.WILDERNESS		),
	ANTARCTICA(		"Antarctica",			LocationType.SEA			),
	TUNGUSKA(		"Tunguska",				LocationType.WILDERNESS		),
	HIMILAYAS(		"The Himalayas",		LocationType.WILDERNESS		);
	
	private final String name_;
	private final LocationType locType_;
	private final List<Path> paths_;
	
	private Location(String name, LocationType locType) {
		name_ = name;
		locType_ = locType;
		paths_ = new ArrayList<Path>();
	}
	
	public final String getName_() {
		return name_;
	}
	
	public final LocationType getSpaceType_() {
		return locType_;
	}
	
	public final List<Path> getPaths_() {
		return paths_;
	}
	
	/**
	 * The following static initialization block sets up all paths_ from any location to all other possible locations
	 * */
	static {

		SPACE1.paths_.add(new Path(SPACE4, PathType.UNCHARTED));
		SPACE1.paths_.add(new Path(SPACE19, PathType.SHIP));
		SPACE1.paths_.add(new Path(SAN_FRAN, PathType.SHIP));
		
		SPACE2.paths_.add(new Path(SAN_FRAN, PathType.SHIP));
		SPACE2.paths_.add(new Path(TOKYO, PathType.SHIP));
		
		SPACE3.paths_.add(new Path(BUENOS_AIRES, PathType.SHIP));
		SPACE3.paths_.add(new Path(SYDNEY, PathType.SHIP));

		SPACE4.paths_.add(new Path(SPACE1, PathType.UNCHARTED));
		SPACE4.paths_.add(new Path(SPACE5, PathType.UNCHARTED));

		SPACE5.paths_.add(new Path(SPACE4, PathType.UNCHARTED));
		SPACE5.paths_.add(new Path(SAN_FRAN, PathType.TRAIN));
		SPACE5.paths_.add(new Path(ARKHAM, PathType.TRAIN));

		SPACE6.paths_.add(new Path(SPACE7, PathType.TRAIN));
		SPACE6.paths_.add(new Path(SAN_FRAN, PathType.TRAIN));
		SPACE6.paths_.add(new Path(ARKHAM, PathType.TRAIN));

		SPACE7.paths_.add(new Path(SPACE6, PathType.TRAIN));
		SPACE7.paths_.add(new Path(SPACE8, PathType.SHIP));
		SPACE7.paths_.add(new Path(SAN_FRAN, PathType.SHIP));
		SPACE7.paths_.add(new Path(BUENOS_AIRES, PathType.SHIP));
		SPACE7.paths_.add(new Path(AMAZON, PathType.UNCHARTED));

		SPACE8.paths_.add(new Path(SPACE7, PathType.SHIP));
		SPACE8.paths_.add(new Path(SPACE10, PathType.SHIP));
		SPACE8.paths_.add(new Path(ARKHAM, PathType.SHIP));
		SPACE8.paths_.add(new Path(BUENOS_AIRES, PathType.SHIP));

		SPACE9.paths_.add(new Path(ARKHAM, PathType.SHIP));

		SPACE10.paths_.add(new Path(SPACE8, PathType.SHIP));
		SPACE10.paths_.add(new Path(SPACE15, PathType.SHIP));
		SPACE10.paths_.add(new Path(ROME, PathType.SHIP));
		SPACE10.paths_.add(new Path(PYRAMIDS, PathType.UNCHARTED));

		SPACE11.paths_.add(new Path(SPACE15, PathType.SHIP));
		SPACE11.paths_.add(new Path(BUENOS_AIRES, PathType.SHIP));

		SPACE12.paths_.add(new Path(BUENOS_AIRES, PathType.SHIP));
		SPACE12.paths_.add(new Path(ANTARCTICA, PathType.SHIP));

		SPACE13.paths_.add(new Path(LONDON, PathType.SHIP));

		SPACE14.paths_.add(new Path(SPACE16, PathType.TRAIN));
		SPACE14.paths_.add(new Path(ROME, PathType.TRAIN));
		
		SPACE15.paths_.add(new Path(SPACE10, PathType.SHIP));
		SPACE15.paths_.add(new Path(SPACE11, PathType.SHIP));
		SPACE15.paths_.add(new Path(SPACE17, PathType.SHIP));
		SPACE15.paths_.add(new Path(SPACE18, PathType.SHIP));
		SPACE15.paths_.add(new Path(AFRICA, PathType.UNCHARTED));

		SPACE16.paths_.add(new Path(SPACE14, PathType.TRAIN));
		SPACE16.paths_.add(new Path(ISTANBUL, PathType.TRAIN));
		SPACE16.paths_.add(new Path(TUNGUSKA, PathType.TRAIN));

		SPACE17.paths_.add(new Path(SPACE15, PathType.SHIP));
		SPACE17.paths_.add(new Path(SPACE20, PathType.SHIP));
		SPACE17.paths_.add(new Path(ISTANBUL, PathType.TRAIN));
		SPACE17.paths_.add(new Path(SHANGHAI, PathType.TRAIN));
		SPACE17.paths_.add(new Path(HIMILAYAS, PathType.UNCHARTED));

		SPACE18.paths_.add(new Path(SPACE15, PathType.SHIP));
		SPACE18.paths_.add(new Path(SYDNEY, PathType.SHIP));

		SPACE19.paths_.add(new Path(SPACE1, PathType.SHIP));
		SPACE19.paths_.add(new Path(SHANGHAI, PathType.TRAIN));
		SPACE19.paths_.add(new Path(TOKYO, PathType.SHIP));
		SPACE19.paths_.add(new Path(TUNGUSKA, PathType.TRAIN));

		SPACE20.paths_.add(new Path(SPACE17, PathType.SHIP));
		SPACE20.paths_.add(new Path(SHANGHAI, PathType.SHIP));
		SPACE20.paths_.add(new Path(TOKYO, PathType.SHIP));
		SPACE20.paths_.add(new Path(SYDNEY, PathType.SHIP));

		SPACE21.paths_.add(new Path(SYDNEY, PathType.UNCHARTED));
		
		SAN_FRAN.paths_.add(new Path(SPACE1, PathType.SHIP));
		SAN_FRAN.paths_.add(new Path(SPACE2, PathType.SHIP));
		SAN_FRAN.paths_.add(new Path(SPACE5, PathType.TRAIN));
		SAN_FRAN.paths_.add(new Path(SPACE6, PathType.TRAIN));
		SAN_FRAN.paths_.add(new Path(SPACE7, PathType.SHIP));

		ARKHAM.paths_.add(new Path(SPACE5, PathType.TRAIN));
		ARKHAM.paths_.add(new Path(SPACE6, PathType.TRAIN));
		ARKHAM.paths_.add(new Path(SPACE8, PathType.SHIP));
		ARKHAM.paths_.add(new Path(SPACE9, PathType.SHIP));
		ARKHAM.paths_.add(new Path(LONDON, PathType.SHIP));

		BUENOS_AIRES.paths_.add(new Path(SPACE3, PathType.SHIP));
		BUENOS_AIRES.paths_.add(new Path(SPACE7, PathType.SHIP));
		BUENOS_AIRES.paths_.add(new Path(SPACE8, PathType.SHIP));
		BUENOS_AIRES.paths_.add(new Path(SPACE11, PathType.SHIP));
		BUENOS_AIRES.paths_.add(new Path(SPACE12, PathType.SHIP));
		BUENOS_AIRES.paths_.add(new Path(AMAZON, PathType.UNCHARTED));

		LONDON.paths_.add(new Path(SPACE13, PathType.SHIP));
		LONDON.paths_.add(new Path(ROME, PathType.SHIP));
		LONDON.paths_.add(new Path(ARKHAM, PathType.SHIP));

		ROME.paths_.add(new Path(SPACE10, PathType.SHIP));
		ROME.paths_.add(new Path(SPACE14, PathType.TRAIN));
		ROME.paths_.add(new Path(LONDON, PathType.SHIP));
		ROME.paths_.add(new Path(ISTANBUL, PathType.TRAIN));
		ROME.paths_.add(new Path(PYRAMIDS, PathType.SHIP));

		ISTANBUL.paths_.add(new Path(SPACE16, PathType.TRAIN));
		ISTANBUL.paths_.add(new Path(SPACE17, PathType.TRAIN));
		ISTANBUL.paths_.add(new Path(ROME, PathType.TRAIN));
		ISTANBUL.paths_.add(new Path(PYRAMIDS, PathType.TRAIN));

		SHANGHAI.paths_.add(new Path(SPACE17, PathType.TRAIN));
		SHANGHAI.paths_.add(new Path(SPACE19, PathType.TRAIN));
		SHANGHAI.paths_.add(new Path(SPACE20, PathType.SHIP));
		SHANGHAI.paths_.add(new Path(TOKYO, PathType.SHIP));
		SHANGHAI.paths_.add(new Path(HIMILAYAS, PathType.UNCHARTED));

		TOKYO.paths_.add(new Path(SPACE2, PathType.SHIP));
		TOKYO.paths_.add(new Path(SPACE19, PathType.SHIP));
		TOKYO.paths_.add(new Path(SPACE20, PathType.SHIP));
		TOKYO.paths_.add(new Path(SHANGHAI, PathType.SHIP));

		SYDNEY.paths_.add(new Path(SPACE3, PathType.SHIP));
		SYDNEY.paths_.add(new Path(SPACE18, PathType.SHIP));
		SYDNEY.paths_.add(new Path(SPACE20, PathType.SHIP));
		SYDNEY.paths_.add(new Path(SPACE21, PathType.UNCHARTED));
		SYDNEY.paths_.add(new Path(ANTARCTICA, PathType.SHIP));

		AMAZON.paths_.add(new Path(SPACE7, PathType.UNCHARTED));
		AMAZON.paths_.add(new Path(BUENOS_AIRES, PathType.UNCHARTED));

		PYRAMIDS.paths_.add(new Path(SPACE10, PathType.UNCHARTED));
		PYRAMIDS.paths_.add(new Path(ROME, PathType.SHIP));
		PYRAMIDS.paths_.add(new Path(ISTANBUL, PathType.TRAIN));
		PYRAMIDS.paths_.add(new Path(AFRICA, PathType.UNCHARTED));

		AFRICA.paths_.add(new Path(SPACE15, PathType.UNCHARTED));
		AFRICA.paths_.add(new Path(PYRAMIDS, PathType.UNCHARTED));

		ANTARCTICA.paths_.add(new Path(SPACE12, PathType.SHIP));
		ANTARCTICA.paths_.add(new Path(SYDNEY, PathType.SHIP));

		TUNGUSKA.paths_.add(new Path(SPACE16, PathType.TRAIN));
		TUNGUSKA.paths_.add(new Path(SPACE19, PathType.TRAIN));

		HIMILAYAS.paths_.add(new Path(SPACE17, PathType.UNCHARTED));
		HIMILAYAS.paths_.add(new Path(SHANGHAI, PathType.UNCHARTED));

	}
	
}
