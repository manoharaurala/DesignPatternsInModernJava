package LazyEvaluation.applicativeOrder;

public class Compute {
    public static void operate(int value) {
        if (Math.random() > 0.5) {
            System.out.println("Use the value: " + value);
        } else {
            System.out.println("continue without using value");
        }

    }

    public static void main(String[] args) {
        operate(compute(20));//application order
    }

    private static int compute(int i) {
        return (int) Math.random();
    }
}
