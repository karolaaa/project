package carrental.business;

public class Car extends Vehicle {

	private int numberOfpeople;
	private String type; // kombi, sedan, hatchhback

	public Car(int idNumberOfVehicle, String carId, int yearOfproduction, String model, int numberOfpeople,
			String type) {
		super(idNumberOfVehicle, carId, yearOfproduction, model);
		this.numberOfpeople = numberOfpeople;
		this.type = type;
	}

	public int getNumberOfpeople() {
		return numberOfpeople;
	}

	public void setNumberOfpeople(int numberOfpeople) {
		this.numberOfpeople = numberOfpeople;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
