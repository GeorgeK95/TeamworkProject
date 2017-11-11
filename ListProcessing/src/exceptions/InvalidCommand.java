package exceptions;

import static data.ExceptionMessages.INVALID_COMMAND;

public class InvalidCommand extends Exception{

    public InvalidCommand() {
        super(INVALID_COMMAND);
    }
}
