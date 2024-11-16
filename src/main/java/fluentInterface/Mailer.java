package fluentInterface;

import java.util.function.Consumer;

public class Mailer {
    private Mailer() {

    }

    public static void send(Consumer<Mailer> block) {
        Mailer mailer = new Mailer();//Create new one reuse  from pool
        block.accept(mailer);
        System.out.println("Sending... ");
    }

    public Mailer from(String address) {
        System.out.println("From: " + address);
        return this;
    }

    public Mailer to(String address) {
        System.out.println("To: " + address);
        return this;
    }

    public Mailer subject(String line) {
        System.out.println("Subject: " + line);
        return this;
    }

    public Mailer body(String message) {
        System.out.println("Body: " + message);
        return this;
    }
}
