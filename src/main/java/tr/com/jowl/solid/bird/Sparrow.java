package tr.com.jowl.solid.bird;

public class Sparrow implements Bird ,Flyable{

    public void eat(String food) {
        System.out.println("Sparrow eat: " + food);
    }

    public void fly() {
        System.out.println("Sparrow fly");
    }
}
