package gr.aueberp.www.AuebErpApp.errors;

import java.io.Serial;

public class ProductDoesNotExistException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public ProductDoesNotExistException() {
        super("This product does not exist");
    }
}
