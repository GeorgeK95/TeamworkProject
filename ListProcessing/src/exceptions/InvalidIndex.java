package exceptions;

import static data.ExceptionMessages.INVALID_INDEX;

public class InvalidIndex extends Exception {

    public InvalidIndex(int index) {
        super(String.format(INVALID_INDEX, index));
    }
}
