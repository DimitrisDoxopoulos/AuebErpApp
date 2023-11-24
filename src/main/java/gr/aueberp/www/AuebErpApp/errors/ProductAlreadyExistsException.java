package gr.aueberp.www.AuebErpApp.errors;

import java.io.Serial;

public class ProductAlreadyExistsException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public ProductAlreadyExistsException() {
        super("Product already exists");
    }
}
