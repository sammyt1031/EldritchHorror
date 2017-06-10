package gameObjects.locationData;

public enum LocationID {
		
	SPACE1(Location.Space1),
	SPACE2(Location.Space2),
	SPACE3(Location.Space3),
	SPACE4(Location.Space4),
	SPACE5(Location.Space5),
	SPACE6(Location.Space6),
	SPACE7(Location.Space7),
	SPACE8(Location.Space8),
	SPACE9(Location.Space9),
	SPACE10(Location.Space10),
	SPACE11(Location.Space11),
	SPACE12(Location.Space12),
	SPACE13(Location.Space13),
	SPACE14(Location.Space14),
	SPACE15(Location.Space15),
	SPACE16(Location.Space16),
	SPACE17(Location.Space17),
	SPACE18(Location.Space18),
	SPACE19(Location.Space19),
	SPACE20(Location.Space20),
	SPACE21(Location.Space21),
	SAN_FRAN(Location.San_Fran),
	ARKHAM(Location.Arkham),
	BUENOS_AIRES(Location.Buenos_Aires),
	LONDON(Location.London),
	ROME(Location.Rome),
	ISTANBUL(Location.Istanbul),
	SHANGHAI(Location.Shanghai),
	TOKYO(Location.Tokyo),
	SYDNEY(Location.Sydney),
	AMAZON(Location.Amazon),
	PYRAMIDS(Location.Pyramids),
	AFRICA(Location.Africa),
	ANTARCTICA(Location.Antarctica),
	TUNGUSKA(Location.Tunguska),
	HIMILAYAS(Location.Himilayas);
	
	public final Location location_;
	
	private LocationID(Location location) {
		location_ = location;
	}
	
}
