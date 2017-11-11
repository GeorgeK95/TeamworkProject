package exceptions;

import static data.ExceptionMessages.INVALID_PARAMETERS;

public class InvalidParameters extends Exception {

    public InvalidParameters() {
        super(INVALID_PARAMETERS);
    }
}
