package carrental.business;

public class Motorcycle extends Vehicle {

	private String type; // sport, cruiser, tourist

	public Motorcycle(int idNumberOfVehicle, String carId, int yearOfproduction, String model, String type) {
		super(idNumberOfVehicle, carId, yearOfproduction, model);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
