package optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Optional.ofNullable("test@mail.com")
                .ifPresentOrElse(email -> System.out.println("Sending mail to : " + email),
                        () -> System.out.println("Cannot send mail"));

    }
}
