package gr.aueberp.www.AuebErpApp.errors;

import java.io.Serial;

public class OrderAlreadyExistsException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public OrderAlreadyExistsException(String orderNumber) {

        super("Order with number " + orderNumber + " already exists");
    }
}
