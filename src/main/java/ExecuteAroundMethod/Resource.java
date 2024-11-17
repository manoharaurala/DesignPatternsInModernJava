package ExecuteAroundMethod;

import java.util.function.Consumer;

public class Resource {
    private Resource() {
        System.out.println("Opening DB connection");
    }


    public static void use(Consumer<Resource> block) {
        Resource resource = new Resource();
        try {
            block.accept(resource);

        } finally {
            resource.close();

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


    private void close() {
        //finalize has been depreciated starting from java 9.Java 7 added ARM-Automatic Resource Management
        //try with resource won't work if we don't use within try
        System.out.println("Closing DB connection");
    }

}
