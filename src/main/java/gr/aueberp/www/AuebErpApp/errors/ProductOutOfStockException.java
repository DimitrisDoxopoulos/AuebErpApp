package gr.aueberp.www.AuebErpApp.errors;

import java.io.Serial;

public class ProductOutOfStockException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public ProductOutOfStockException() {
        super("This product is out of stock");
    }
}
