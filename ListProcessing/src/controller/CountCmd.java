package controller;

/**
 * Created by George-Lenovo on 6/29/2017.
 */

import io.ConsoleOutputWriter;

import static data.StringList.STRING_LIST;

public class CountCmd extends Command {
    String str;

    public CountCmd(String str) {
        this.str = str;
    }

    @Override
    public void execute() {
        ConsoleOutputWriter.writeLine(String.valueOf(STRING_LIST.stream().filter(x -> x.equals(str)).count()));
    }
}
