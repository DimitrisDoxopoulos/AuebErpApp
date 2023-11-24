package gr.aueberp.www.AuebErpApp.errors;

import java.io.Serial;

public class OrderStatusAlreadyExistsException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public OrderStatusAlreadyExistsException() {
        super("The order status does not exist");
    }
}
