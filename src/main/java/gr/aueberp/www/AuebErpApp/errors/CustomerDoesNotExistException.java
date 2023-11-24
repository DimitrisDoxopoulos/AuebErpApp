package gr.aueberp.www.AuebErpApp.errors;

import java.io.Serial;

public class CustomerDoesNotExistException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public CustomerDoesNotExistException(String email) {
        super("Customer with email " + email + " does not exist");
    }
}
