package gameObjects.locationData;

import gameObjects.locationData.LocationID;
import gameObjects.locationData.PathType;

public final class Path {
	
	private final LocationID dest_;
	private final PathType pathType_;
	
	Path(LocationID dest, PathType pathType) {
		dest_ = dest;
		pathType_ = pathType;
	}
	
	public final LocationID getDest_() {
		return dest_;
	}
	
	public final PathType getPathType_() {
		return pathType_;
	}
	
}
