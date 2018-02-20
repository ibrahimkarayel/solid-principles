package tr.com.jowl.solid.bird;

public class Penguin implements Bird {

    public void eat(String food) {
        System.out.println("Penguin eat: " + food);
    }

  /*  public void fly() {
        throw new UnsupportedOperationException("Penguin cant fly");

    }*/
}
