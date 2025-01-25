import java.util.Scanner;

public class MainScreen implements Protocol_Garage{
    private DB db;
    private Garage garage;

    @Override
    public void fixed(Vehicle vehicle) {
        System.out.println("Notification: Repair completed for " + vehicle.getName());

    }



    public MainScreen() {
        db = new DB();
    }


    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Main Screen");

        while (true) {
            System.out.println("Enter 1 for Motorcycle, 2 for Car, or 3 for Truck (or 0 to finish):");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                break;
            }

            System.out.println("Enter the name of the vehicle:");
            String name = scanner.nextLine();

            Vehicle vehicle;
            switch (choice) {
                case 1:
                    vehicle = new Motorcycle(name);
                    break;
                case 2:
                    vehicle = new Car(name);
                    break;
                case 3:
                    vehicle = new Truck(name);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }

            db.addVehicle(vehicle);
            System.out.println("Vehicle added: " + vehicle.getName());
        }

        garage = new Garage(db.getVehicles(), this);

        System.out.println("Starting the Garage...");
        garage.runGarage();
    }


}
