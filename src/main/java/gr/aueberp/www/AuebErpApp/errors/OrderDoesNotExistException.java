package gr.aueberp.www.AuebErpApp.errors;

import java.io.Serial;

public class OrderDoesNotExistException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public OrderDoesNotExistException() {
        super("Order does not exist");
    }
}
