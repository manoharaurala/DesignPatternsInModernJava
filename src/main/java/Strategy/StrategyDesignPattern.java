package Strategy;

import java.util.List;
import java.util.function.Predicate;

public class StrategyDesignPattern {

    //Refactor before you add a feature or after you add feature but never in the middle of it.
    //Programming is 10% skill.90% discipline.
    //Commit often and commit in small portion
    //merge hell is what you give and should never receive
    //Frequent commits make the cost of undo zero
    public static int totalValue(List<Integer> values, Predicate<Integer> selector) {
        return values.stream()
                .filter(selector)
                .mapToInt(e -> e)
                .sum();


    }

    public static void main(String[] args) {
        var values = List.of(11, 23, 45, 67, 34, 54, 67, 89, 56, 69);
        System.out.println("Sum of all numbers in list: " + totalValue(values, number -> true));
        System.out.println("Sum of all even numbers in list: " + totalValue(values, StrategyDesignPattern::isEven));
        System.out.println("Sum of all even numbers in list: " + totalValue(values, StrategyDesignPattern::isOdd));

    }

    //Strategies
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }
    /*
    Strategy pattern
    1.We have algorithm, we want to vary small part of it.
    2.Java started out with objet oriented ideology.
    3.Java 1.1 we have anonymous inner classes.
    4.You would create interface for strategy.We have a bunch of classes or anonymous classes to implement that interface.

    5.Step back:What is really strategy?It is definitely not class.Fundamentally, strategy is a function.
    Naturally strategies can be implemented using lambda.
     */
}
