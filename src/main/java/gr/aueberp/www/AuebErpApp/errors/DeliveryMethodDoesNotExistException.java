package gr.aueberp.www.AuebErpApp.errors;

import java.io.Serial;

public class DeliveryMethodDoesNotExistException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public DeliveryMethodDoesNotExistException() {
        super("Delivery method already exists");
    }
}
