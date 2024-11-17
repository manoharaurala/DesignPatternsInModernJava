package ExecuteAroundMethod.usingAutoCloseable;

public class Resource implements AutoCloseable {
    public Resource() {
        System.out.println("Opening DB connection");
    }

    public static void main(String[] args) {
        try (Resource resource = new Resource()) {
            resource.op1();
            resource.op2();
            //close is called automatically
        }
    }

    public Resource op1() {
        System.out.println("OP1");
        return this;
    }

    public Resource op2() {
        System.out.println("OP2");
        return this;
    }

    @Override
    public void close() {
        //finalize has been depreciated starting from java 9.Java 7 added ARM-Automatic Resource Management
        //try with resource won't work if we don't use within try
        System.out.println("Closing DB connection");
    }

}
