package gr.aueberp.www.AuebErpApp.errors;

import java.io.Serial;

public class BillingAddressDoesNotExistException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public BillingAddressDoesNotExistException() {
        super("The billing address does not exist");
    }
}
