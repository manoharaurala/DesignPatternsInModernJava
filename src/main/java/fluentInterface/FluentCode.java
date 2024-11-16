package fluentInterface;

public class FluentCode {
    public static void main(String[] args) {
        /*
        Mailer mailer=new Mailer();
        mailer.from("ruby420@gmail.com");
        mailer.to("annayya720@gmail.com");
        mailer.subject("420 Ruby");
        mailer.body("...details...");
        mailer.send();
        //noisy
        //should I reuse Mailer instance or not

         */

        Mailer.send(mailer -> mailer.from("ruby420@gmail.com")
                .to("annayya720@gmail.com")
                .subject("420 Ruby")
                .body("...details...")
        );

        /*
        1.Code is less noisy
        2.If mailer instance should be reused or not my concern
         */
    }
}
