import java.util.List;

public class Garage {
    private List<Vehicle> vehicles;
    private Protocol_Garage protocol;


    public Garage(List<Vehicle> vehicles, Protocol_Garage protocol) {
        this.vehicles = vehicles;
        this.protocol = protocol;
    }

    public void runGarage() {
        for (Vehicle vehicle : vehicles) {
            try {
                System.out.println("Starting repair for: " + vehicle.getName());
                Thread.sleep(vehicle.getFixTime()*1000);
                vehicle.fixed();
                protocol.fixed(vehicle);
            } catch (InterruptedException e) {
                System.out.println("Error during repair: " + e.getMessage());
            }
        }
        System.out.println("All repairs completed.");
    }



}
