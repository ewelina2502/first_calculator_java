package sety;

import java.util.HashSet;
import java.util.Set;

public class SetyTest {

    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("orange");

        System.out.println(fruits.contains("apple"));
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());

        Set<String> vege = new HashSet<>(); //  Poprawne działanie kolekcji wymaga poprawnie zaimplementowanych metod hashCode/equals.
        vege.add("potatoes");
        vege.add("onion");

        vege.addAll(fruits);

        System.out.println(vege.size());

        for(String friut : fruits) {
            System.out.println(friut);
        } //iterowanie po owocach

    }
}
