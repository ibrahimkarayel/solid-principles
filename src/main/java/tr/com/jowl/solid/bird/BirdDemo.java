package tr.com.jowl.solid.bird;

import java.util.Arrays;
import java.util.List;

public class BirdDemo {

    public static void main(String[] args) {

        List<Bird> birds = Arrays.asList(new Crow(), new Sparrow(), new Ostrich(), new Penguin());
        List<Flyable> flyables = Arrays.asList(new Crow(), new Sparrow());

        birds.forEach(b -> {
            if (b instanceof Crow) {
                b.eat("mouse");
            } else if (b instanceof Ostrich || b instanceof Sparrow) {
                b.eat("insect");
            } else if (b instanceof Penguin) {
                b.eat("fish");
            } else {
                b.eat("corn");
            }
        });

        flyables.forEach(bird -> bird.fly());


    }


}
