package carrental.business;

public class Truck extends Vehicle {

	private int capacity; // ³adownoœæ

	public Truck(int idNumberOfVehicle, String carId, int yearOfproduction, String model, int capacity) {
		super(idNumberOfVehicle, carId, yearOfproduction, model);
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
