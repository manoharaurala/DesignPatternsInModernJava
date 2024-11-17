package ExecuteAroundMethod;

public class ExecuteAroundMethodPattern {
    public static void use() {
        Resource.use(resource ->
                resource.op1()
                        .op2());

    }

    public static void main(String[] args) {
        use();
    }
}
