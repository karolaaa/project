package carrental;

import java.util.Scanner;

import carrental.business.Car;
import carrental.business.CarRental;
import carrental.business.Client;
import carrental.business.Motorcycle;
import carrental.business.Truck;

public class Application {

	static CarRental carRental = new CarRental();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(carRental);

		carRental.getClients().add(new Client(1, "karola", "mogielnicka", "b", "123"));
		carRental.getClients().add(new Client(2, "Tomek", "Mogielnicki", "b", "234"));
		carRental.getClients().add(new Client(3, "ula", "mogielnicka", "b", "345"));

		carRental.getVehicles().add(new Motorcycle(1, "honda", 1989, "xrc", "harley"));
		carRental.getVehicles().add(new Car(2, "skoda", 456, "fabia", 10, "sedan"));
		carRental.getVehicles().add(new Truck(3, "jelcz", 1548, "nji", 15));

		// trzeba poprawic wypisywanie pojazdow, wszystkie dodane pokazuja sie
		// jako Vehicle

		System.out.println("Program wykonuje nastêpuj¹ce czynnoœci: " + "\n1. dodawanie klienta, "
				+ "\n2. usuwanie klienta, " + "\n3. przegl¹danie danych klienta, " + "\n4. dodawanie pojazdu, "
				+ "\n5. usuwanie pojazdu, " + "\n6. przegl¹danie danych pojazdu, " + "\n7. dodawanie nowego zlecenia, "
				+ "\n8. przegl¹danie zlecenia, " + "\n9. zapis danych do pliku, " + "\n10. odczyt danych z pliku. "
				+ "\n11. koniec.");

		Scanner sc = new Scanner(System.in);
		String choice = "";

		while (choice != "11") {

			System.out.println("Wybierz opcjê: ");
			choice = sc.nextLine();

			switch (choice) {
			case "1": {
				carRental.addClient();
			}
				break;
			case "2": {
				carRental.deleteClient();
			}
				break;
			case "3": {

				carRental.browseClient();
				break;
			}
			case "4": {
				carRental.addVehicle();
			}
				break;
			case "5": {
				carRental.deleteVehicle();
			}
				break;
			case "6": {
				carRental.browseVehicle();
			}
				break;
			case "7": {
				System.out.println("dodawanie nowego zlecenia");
			}
				break;
			case "8": {
				System.out.println("przegl¹danie zlecenia");
			}
				break;
			case "9": {
				System.out.println("zapis danych do pliku");
			}
				break;
			case "10": {
				System.out.println("odczyt danych z pliku");
			}
				break;
			case "11": {
				System.out.println("Koniec.");
			}
				break;
			default: {
				System.out.println("Z³y wybór");
			}
				break;
			}
		}

	}
}
