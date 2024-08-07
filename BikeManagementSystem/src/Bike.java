
public class Bike {
	int bikeId;
	int bikeMileage;
	String bikeName;
	
	public Bike(int bikeId, int bikeMileage, String bikeName) {
		this.bikeId = bikeId;
		this.bikeMileage = bikeMileage;
		this.bikeName = bikeName;
	}
	public int getBikeId() {
		return bikeId;
	}
	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}
	public int getBikeMileage() {
		return bikeMileage;
	}
	public void setBikeMileage(int bikeMileage) {
		this.bikeMileage = bikeMileage;
	}
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public String toString() {
		return "Bike [bikeId=" + bikeId + ", bikeMileage=" + bikeMileage + ", bikeName=" + bikeName + "]";
	}
	
	
}
