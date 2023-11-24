package gr.aueberp.www.AuebErpApp.errors;

import java.io.Serial;

public class OrderPaymentAlreadyExistsException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public OrderPaymentAlreadyExistsException() {
        super("Order payment already exists");
    }
}
