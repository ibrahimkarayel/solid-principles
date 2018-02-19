package tr.com.jowl.solid.vehicle;

import tr.com.jowl.solid.util.CarType;

public class SpeedOrganizer {

    public static void main(String[] args) {
        Car car = new Mercedes("QWER123", CarType.MERCEDES);
        System.out.println(calculateSpeed(car, 10));

        car = new BMV("12345WWW", CarType.BMW);
        System.out.println(calculateSpeed(car, 15));

        car = new Toyato("#$%RTTTT", CarType.TOYOTA);
        System.out.println(calculateSpeed(car, 5));
    }

    public static double calculateSpeed(Car car, double extra) {
        return car.speed(extra);
    }

    //Bad design example removed after changes

/*    public static void main(String[] args) {
        Car car = new BMV("!QAZ@WSXX", CarType.BMW);
        System.out.println(SpeedOrganizer.calculateSpeed(car));

        car = new Mercedes("1234QWER", CarType.MERCEDES);
        System.out.println(SpeedOrganizer.calculateSpeed(car));

        car = new Toyato("REWQ1234", CarType.TOYOTA);
        System.out.println(SpeedOrganizer.calculateSpeed(car));
    }

    public static double calculateSpeed(Car car) {
        if (car.type.equals(CarType.BMW))
            return bmwSpeed(10);
        else if (car.type.equals(CarType.MERCEDES))
            return mercedesSpeed(12);
        else if (car.type.equals(CarType.TOYOTA))
            return toyotaSpeed(5);
        throw new RuntimeException("Unsupported Car");
    }

    public static double mercedesSpeed(double extra) {
        return 150 + extra;
    }

    public static double bmwSpeed(double extra) {
        return 155 + extra;
    }

    public static double toyotaSpeed(double extra) {
        return 150 + extra;
    }*/

}
