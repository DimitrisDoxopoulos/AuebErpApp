package gr.aueberp.www.AuebErpApp.errors;

import java.io.Serial;

public class OrderPaymentDoesNotExistException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public OrderPaymentDoesNotExistException() {
        super("Order payment does not exist");
    }
}
