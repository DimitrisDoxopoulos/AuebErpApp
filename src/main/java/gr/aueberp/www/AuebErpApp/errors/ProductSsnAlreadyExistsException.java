package gr.aueberp.www.AuebErpApp.errors;

import java.io.Serial;

public class ProductSsnAlreadyExistsException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public ProductSsnAlreadyExistsException(String ssn) {
        super("This product with code " + ssn + " already exists");
    }
}
