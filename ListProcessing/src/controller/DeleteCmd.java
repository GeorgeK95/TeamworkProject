package controller;

/**
 * Created by George-Lenovo on 6/29/2017.
 */

import io.ConsoleOutputWriter;

import static data.StringList.STRING_LIST;

public class DeleteCmd extends Command {

    private int index;

    public DeleteCmd(int index) {
        this.index = index;
    }

    @Override
    public void execute() {
        STRING_LIST.remove(this.index);
        ConsoleOutputWriter.writeLine(String.join(" ", STRING_LIST));
    }
}
