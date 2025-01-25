public abstract class Vehicle implements Fixable{
    public abstract int getFixTime();


    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
