public class Car extends Vehicle{
    @Override
    public int getFixTime() {
        return 5;
    }

    public Car(String name) {
        super(name);
    }

    @Override
    public void fixed() {
        System.out.println("Car " + getName() + ": Engine and tires have been repaired.");    }

    @Override
    public String toString() {
        return "Car: " + getName();
    }

}
