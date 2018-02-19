package tr.com.jowl.solid.vehicle;

import tr.com.jowl.solid.util.CarType;

public class Mercedes extends Car {

    public Mercedes(String license, CarType type) {
        super(license, type);
    }

    @Override
    public double speed(double extra) {
        return 150+extra;
    }
}
