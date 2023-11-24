package gr.aueberp.www.AuebErpApp.errors;

import java.io.Serial;

public class PaymentMethodDoesNotExistException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public PaymentMethodDoesNotExistException() {
        super("Payment method does not exist");
    }
}
