package LazyEvaluation.normalOrder;

import java.util.function.Supplier;

public class Compute {
    public static void operate(Supplier<Double> supplier) {
        if (Math.random() > 0.5) {
            System.out.println("Use the value: " + supplier.get());
        } else {
            System.out.println("continue without using value");
        }

    }

    public static void main(String[] args) {
        operate(Compute::compute);//application order
    }

    private static double compute() {
        return Math.random();
    }
}


