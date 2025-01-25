public class Motorcycle extends Vehicle{
    @Override
    public int getFixTime() {
        return 3;
    }


    public Motorcycle(String name) {
        super(name);
    }


    @Override
    public void fixed() {
        System.out.println("Motorcycle " + getName() + ": Both wheels have been repaired.");
    }

    @Override
    public String toString() {
        return "Motorcycle: " + getName();
    }

}
