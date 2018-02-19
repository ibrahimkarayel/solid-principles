package tr.com.jowl.solid.vehicle;

import tr.com.jowl.solid.util.CarType;

public class Toyato extends Car {

    public Toyato(String license, CarType type) {
        super(license, type);
    }

    @Override
    public double speed(double extra) {
        return 120+5;
    }
}
