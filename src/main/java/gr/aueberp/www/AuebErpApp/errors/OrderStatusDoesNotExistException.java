package gr.aueberp.www.AuebErpApp.errors;

import java.io.Serial;

public class OrderStatusDoesNotExistException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public OrderStatusDoesNotExistException() {
        super("Order status does not exist");
    }
}
