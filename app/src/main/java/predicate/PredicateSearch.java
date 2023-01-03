package predicate;

import java.util.ArrayList;
import java.util.List;

public class PredicateSearch {

    public static void main(String[] args) {
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", true, false));
        animals.add(new Animal("Kangaroo", false, true));
        animals.add(new Animal("rabbit", false, true));
        animals.add(new Animal("turtle", true, true));

        print(animals, Animal::canHop);
    }

    private static void print(List<Animal> animals, Predicate<Animal> p) {
        System.out.println("------------- animal can swim ---------------");
        for (Animal animal : animals) {
            if (p.test(animal))
                System.out.print(animal);
        }
        System.out.println();
    }
}
