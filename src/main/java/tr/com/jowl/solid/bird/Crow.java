package tr.com.jowl.solid.bird;


public class Crow implements Bird, Flyable {

    public void eat(String food) {
        System.out.println("Crow eat: " + food);
    }

    public void fly() {
        System.out.println("Crow fly");
    }
}
