public class Truck extends Vehicle{
    @Override
    public int getFixTime() {
        return 10;
    }

    public Truck(String name) {
        super(name);
    }

    @Override
    public void fixed() {
        System.out.println("Truck " + getName() + ": Cargo area and tires have been repaired.");
    }


    @Override
    public String toString() {
        return "Truck: " + getName();
    }

}
