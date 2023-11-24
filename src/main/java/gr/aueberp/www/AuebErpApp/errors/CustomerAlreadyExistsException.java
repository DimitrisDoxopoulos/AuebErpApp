package gr.aueberp.www.AuebErpApp.errors;

import java.io.Serial;

public class CustomerAlreadyExistsException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public CustomerAlreadyExistsException(String email) {
        super("Customer with email " + email + " already exists");
    }
}
