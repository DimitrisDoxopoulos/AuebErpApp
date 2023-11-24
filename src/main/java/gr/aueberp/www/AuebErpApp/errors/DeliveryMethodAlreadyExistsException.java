package gr.aueberp.www.AuebErpApp.errors;

import java.io.Serial;

public class DeliveryMethodAlreadyExistsException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public DeliveryMethodAlreadyExistsException() {
        super("Delivery method already exists");
    }
}
