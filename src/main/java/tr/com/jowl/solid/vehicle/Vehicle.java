package tr.com.jowl.solid.vehicle;

public abstract class Vehicle {
    protected String license;
    protected String color;
    protected int wheels;

    public Vehicle(String license) {
        this.license = license;
        System.out.println(this.getClass().getSimpleName() + " :" + license);
    }
}
