package gr.aueberp.www.AuebErpApp.errors;

import java.io.Serial;

public class DeliveryAddressDoesNotExistException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public DeliveryAddressDoesNotExistException() {
        super("The delivery address does not exist");
    }
}
