package carrental.business;

public class Vehicle {

	private int idNumberOfVehicle;
	private String carId;
	private int yearOfproduction;
	private String model;

	public Vehicle(int idNumberOfVehicle, String carId, int yearOfproduction, String model) {
		super();
		this.idNumberOfVehicle = idNumberOfVehicle;
		this.carId = carId;
		this.yearOfproduction = yearOfproduction;
		this.model = model;
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public int getYearOfproduction() {
		return yearOfproduction;
	}

	public void setYearOfproduction(int yearOfproduction) {
		this.yearOfproduction = yearOfproduction;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getIdNumberOfVehicle() {
		return idNumberOfVehicle;
	}

	public void setIdNumberOfVehicle(int idNumberOfVehicle) {
		this.idNumberOfVehicle = idNumberOfVehicle;
	}

	@Override
	public String toString() {
		return "Vehicle [idNumberOfVehicle=" + idNumberOfVehicle + ", carId=" + carId + ", yearOfproduction="
				+ yearOfproduction + ", model=" + model + "]";
	}

}
