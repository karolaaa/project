package carrental.business;

public class Client {

	private int idNumberOfClient; // nr nadawany przez pracownika wypozyczalni
	private String name;
	private String lastname;
	private String driveLicense; // kategoria
	private String idNumber; // nr dokumentu

	public Client(int idNumberOfClient, String name, String lastname, String driveLicense, String idNumber) {
		super();
		this.idNumberOfClient = idNumberOfClient;
		this.name = name;
		this.lastname = lastname;
		this.driveLicense = driveLicense;
		this.idNumber = idNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDriveLicense() {
		return driveLicense;
	}

	public void setDriveLicense(String driveLicense) {
		this.driveLicense = driveLicense;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public int getIdNumberOfClient() {
		return idNumberOfClient;
	}

	public void setIdNumberOfClient(int idNumberOfClient) {
		this.idNumberOfClient = idNumberOfClient;
	}

	@Override
	public String toString() {
		return "Client [idNumberOfClient=" + idNumberOfClient + ", name=" + name + ", lastname=" + lastname
				+ ", driveLicense=" + driveLicense + ", idNumber=" + idNumber + "]";
	}

}
