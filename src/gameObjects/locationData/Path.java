package gameObjects.locationData;

import gameObjects.locationData.Location;

public final class Path {
	
	public static enum PathType {
		TRAIN, UNCHARTED, SHIP;
	}
	
	private final Location dest_;
	private final PathType pathType_;
	
	Path(Location dest, PathType pathType) {
		dest_ = dest;
		pathType_ = pathType;
	}
	
	public final Location getDest_() {
		return dest_;
	}
	
	public final PathType getPathType_() {
		return pathType_;
	}
	
}
