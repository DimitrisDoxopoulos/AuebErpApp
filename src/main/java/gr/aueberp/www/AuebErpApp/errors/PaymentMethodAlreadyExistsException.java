package gr.aueberp.www.AuebErpApp.errors;

import java.io.Serial;

public class PaymentMethodAlreadyExistsException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public PaymentMethodAlreadyExistsException() {
        super("Payment method already exists");
    }
}
