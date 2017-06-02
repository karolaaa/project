package carrental.business;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarRental {

	private List<Client> clients;
	private List<Vehicle> vehicles;
	private List<CarRent> carRents;
	private Scanner sc = new Scanner(System.in);

	// konstruktor bezparametrowy
	public CarRental() {
		clients = new ArrayList<Client>();
		vehicles = new ArrayList<Vehicle>();
		carRents = new ArrayList<CarRent>();
	}

	public void addClient() {
		System.out.println("dodawanie klienta");

		System.out.println("Wprowadz nr ewidencyjny klienta: ");
		int idNumberOfClient = sc.nextInt();
		System.out.println("podaj imie: ");
		String name = sc.nextLine();
		System.out.println("podaj nazwisko: ");
		String lastname = sc.nextLine();
		System.out.println("podaj kategorie dokumentu: ");
		String driveLicense = sc.nextLine();
		System.out.println("Podaj nr dokumentu");
		String idNumber = sc.nextLine();

		Client c = new Client(idNumberOfClient, name, lastname, driveLicense, idNumber);
		clients.add(c); // metoda z klasy List
		System.out.println("dodano klienta o numerze " + idNumberOfClient + "\n" + c);
		// System.out.println(clients);
	}

	public void deleteClient() {

		System.out.println("Usuwanie klienta z bazy.");
		System.out.println("Podaj nr ewidencyjny klineta, ktorego chcesz usunac z bazy: ");
		sc = new Scanner(System.in);
		int idNumberOfClient = sc.nextInt();

		boolean clientDeleted = false; // flaga
		for (int i = 0; i < clients.size(); i++) {
			Client c = clients.get(i);
			if (idNumberOfClient == c.getIdNumberOfClient()) {
				clients.remove(i);
				clientDeleted = true;
				System.out.println("Usunieto klienta o nr " + idNumberOfClient);
				break;
			}
		}
		if (!clientDeleted) {
			System.out.println("Nie znaleziono klienta do usuniecia.");
		}
	}

	public void browseClient() {
		System.out.println("Przegl�danie danych klienta.\n");
		System.out.println("Co chcesz zrobi�?" + "\n1. Poka� ca�� list� klient�w."
				+ "\n2. Poka� klienta o konkretnym nr ewidencyjnym.");
		System.out.println("Wybierz opcj�: ");
		Scanner sc = new Scanner(System.in);
		String choice = "";
		choice = sc.nextLine();

		switch (choice) {
		case "1":
			/*
			 * for (int i = 0; i < clients.size(); i++) {
			 * System.out.println(clients.get(i)); }
			 */
			showClients();
			break;
		case "2":
			System.out.println("Podaj nr ewidencyjny klienta, kt�rego dane chcezsz przegl�da�: ");
			int idNumberOfClient = sc.nextInt();
			boolean clientFound = false; // flaga
			for (int i = 0; i < clients.size(); i++) {
				Client c = clients.get(i);
				if (idNumberOfClient == c.getIdNumberOfClient()) {
					System.out.println(clients.get(i));
					clientFound = true;
					System.out.println("pokazano klienta o nr " + idNumberOfClient);
					break;
				}
			}
			if (!clientFound) {
				System.out.println("Nie znaleziono klienta do wyswietlenia.");
			}
		}

		/*
		 * int choiceIdNumberOfClient = sc.nextInt();
		 * 
		 * boolean clientFound = false; // flaga for (int i = 0; i <
		 * clients.size(); i++) { Client c = clients.get(i); if
		 * (choiceIdNumberOfClient == c.getIdNumberOfClient()) {
		 * System.out.println(clients.get(i)); clientFound = true;
		 * System.out.println("pokazano klienta o nr " +
		 * choiceIdNumberOfClient); break; } }
		 */
	}

	public void addVehicle() {
		System.out.println(
				"Dodawanie nowego pojazdu. \n1. Samoch�d osobowy. \n2. Motocykl. \n3. Ci�ar�wka. \nKt�ry rodzaj auta chcesz wprowadzi�:");

		String choice = "";
		choice = sc.nextLine();
		switch (choice) {
		case "1":
			System.out.println("Wybra�e� auto osobowe. ");

			// wczytuj� atrybuty z klasy Vehicle
			System.out.println("Wprowadz nr ewidencyjny pojazdu: ");
			int numberOfCar = sc.nextInt();
			sc.nextLine();
			System.out.println("Wprowadz mark�: ");
			String id = sc.nextLine();
			System.out.println("Wprowadz rocznik: ");
			int year = sc.nextInt();
			sc.nextLine();
			// sc.nextLine() - problem ze szczytaniem stringa po "incie", w
			// kodzie
			// asci enter: CR\LN carriage return i new line
			System.out.println("Wprowadz model: ");
			String model = sc.nextLine();
			System.out.println("Ile os�b mo�e podr�owa� autem: ");
			int numberOfPeople = sc.nextInt();
			sc.nextLine();
			System.out.println("Wybierz wersj� auta: ");
			String type = sc.nextLine();

			Car car = new Car(numberOfCar, id, year, model, numberOfPeople, type);
			vehicles.add(car);
			System.out.println("Do bazy dodano nowe auto.\n" + car);

			break;
		case "2":
			System.out.println("Wybra�e� motocykl.");

			System.out.println("Wprowadz nr ewidencyjny motocykla: ");
			int numberOfMotorcycle = sc.nextInt();
			sc.nextLine();
			System.out.println("Wprowadz mark�: ");
			String idMotorcycle = sc.nextLine();
			System.out.println("Wprowadz rocznik: ");
			int yearMotorcycle = sc.nextInt();
			sc.nextLine();
			System.out.println("Wprowadz model: ");
			String modelMotorcycle = sc.nextLine();
			System.out.println("Jakiego typu ma by� motocykl: ");
			String typeMotorcycle = sc.nextLine();

			Motorcycle motorcycle = new Motorcycle(numberOfMotorcycle, idMotorcycle, yearMotorcycle, modelMotorcycle,
					typeMotorcycle);
			System.out.println("Do bazy dodano nowy motocykl. \n" + motorcycle);

			break;
		case "3":
			System.out.println("Wybra�e� ci�ar�wk�.");

			System.out.println("Wprowadz nr ewidencyjny ci�ar�wki: ");
			int numberOfTruck = sc.nextInt();
			sc.nextLine();
			System.out.println("Wprowadz mark�: ");
			String idTruck = sc.nextLine();
			System.out.println("Wprowadz rocznik: ");
			int yearTruck = sc.nextInt();
			sc.nextLine();
			System.out.println("Wprowadz model: ");
			String modelTruck = sc.nextLine();
			System.out.println("Podaj �adowno�� ci�ar�wki: ");
			int capacity = sc.nextInt();

			Truck truck = new Truck(numberOfTruck, idTruck, yearTruck, modelTruck, capacity);
			vehicles.add(truck);
			System.out.println("Do bazy dodano now� ci�ar�wk�.\n" + truck);

			break;
		default:
			break;
		}

	}

	public void deleteVehicle() {

		System.out.println("Usuwanie pojazdu z bazy.");
		System.out.println("Podaj nr ewidencyjny pojazdu, kt�ry chcesz usunac z bazy: ");
		sc = new Scanner(System.in);
		int idNumberOfVehicle = sc.nextInt();

		boolean vehicleDeleted = false; // flaga
		for (int i = 0; i < vehicles.size(); i++) {
			Vehicle v = vehicles.get(i);
			if (idNumberOfVehicle == v.getIdNumberOfVehicle()) {
				vehicles.remove(i);
				vehicleDeleted = true;
				System.out.println("Usunieto pojazd o nr " + idNumberOfVehicle);
				break;
			}
		}
		if (!vehicleDeleted) {
			System.out.println("Nie znaleziono pojazdu do usuni�cia.");
		}
	}

	public void browseVehicle() {

		System.out.println("Przegl�danie bazy pojazd�w.\n");
		System.out.println("Co chcesz zrobi�?" + "\n1. Poka� list� wszystkich pojazd�w."
				+ "\n2. Poka� pojazd o konkretnym nr ewidencyjnym.");
		System.out.println("Wybierz opcj�: ");
		Scanner sc = new Scanner(System.in);
		String choice = "";
		choice = sc.nextLine();

		switch (choice) {
		case "1":
			showVehicles();
			break;
		case "2":
			System.out.println("Podaj nr ewidencyjny pojazdu, kt�rego dane chcezsz przegl�da�: ");
			int idNumberOfVehicle = sc.nextInt();
			boolean vehicleFound = false; // flaga
			for (int i = 0; i < vehicles.size(); i++) {
				Vehicle v = vehicles.get(i);
				if (idNumberOfVehicle == v.getIdNumberOfVehicle()) {
					System.out.println(vehicles.get(i));
					vehicleFound = true;
					System.out.println("Pokazano pojazd o nr " + idNumberOfVehicle);
					break;
				}
			}
			if (!vehicleFound) {
				System.out.println("Nie znaleziono pojazdu do wyswietlenia.");
			}
		}

	}

	public void addCarRent() {

	}

	public void browseCarRent() {

	}

	public void loadDataToFile() {

	}

	public void readDataFromFile() {

	}

	public void showClients() {
		for (int i = 0; i < clients.size(); i++) {
			System.out.println(clients.get(i));
		}
	}

	public void showVehicles() {
		for (int i = 0; i < vehicles.size(); i++) {
			System.out.println(vehicles.get(i));
		}
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public List<CarRent> getCarRents() {
		return carRents;
	}

	public void setCarRents(List<CarRent> carRents) {
		this.carRents = carRents;
	}
}
