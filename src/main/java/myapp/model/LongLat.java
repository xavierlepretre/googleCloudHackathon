package myapp.model;

public class LongLat {
	private int latitude;
	private int longitude;
	
	public LongLat(int latitude, int longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public int getLatitude() {
		return latitude;
	}
	public int getLongitude() {
		return longitude;
	}
}
