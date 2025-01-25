import java.util.ArrayList;
import java.util.List;

class DB {
    private List<Vehicle> vehicles;

    public DB() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println(vehicle + " added to the database.");
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}