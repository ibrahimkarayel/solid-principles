package tr.com.jowl.solid.vehicle;

import tr.com.jowl.solid.util.CarType;

public class BMV extends Car {

    public BMV(String license, CarType type) {
        super(license, type);
    }

    @Override
    public double speed(double extra) {
        return 155 + extra;
    }
}
