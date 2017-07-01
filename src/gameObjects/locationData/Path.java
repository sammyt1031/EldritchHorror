package gameObjects.locationData;

import gameObjects.locationData.PathType;

public final class Path {
		
	private final int destID;
	private final PathType pathType;
	
	Path(int destID, PathType pathType) {
		this.destID = destID;
		this.pathType = pathType;
	}
	
	public final int getDestID() {
		return this.destID;
	}
	
	public final PathType getPathType() {
		return this.pathType;
	}
	
}