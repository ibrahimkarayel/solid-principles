package tr.com.jowl.solid.bird;

public class Ostrich implements Bird {

    public void eat(String food) {
        System.out.println("Ostrich eat: " + food);
    }

  /*  public void fly() {
        throw new UnsupportedOperationException("Ostrich cant fly");

    }*/
}
