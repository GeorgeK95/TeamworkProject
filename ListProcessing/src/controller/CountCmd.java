package controller;

/**
 * Created by George-Lenovo on 6/29/2017.
 */

import io.ConsoleOutputWriter;

import static data.StringList.STRING_LIST;

public class CountCmd extends Command {
    private ConsoleOutputWriter writer;
    String str;

    public CountCmd(String str) {
        this.str = str;
        this.writer = new ConsoleOutputWriter();
    }

    @Override
    public void execute() {
        writer.writeLine(String.valueOf(STRING_LIST.stream().filter(x -> x.equals(str)).count()));
    }
}
