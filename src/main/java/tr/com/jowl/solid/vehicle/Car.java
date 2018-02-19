package tr.com.jowl.solid.vehicle;

import tr.com.jowl.solid.util.CarType;

public abstract class Car extends Vehicle {
    protected CarType type;

    public Car(String license, CarType type) {
        super(license);
        this.type = type;
    }

    public abstract double speed(double extra);
}
