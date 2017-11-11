package controller;

import java.util.StringJoiner;

import static data.StringList.STRING_LIST;

public class AppendCmd extends Command {
    private String string;

    public AppendCmd(String string) {
        this.string = string;
    }

    @Override
    public void execute() {
        STRING_LIST.add(string);

        StringJoiner sj = new StringJoiner(" ");
        for (String str : STRING_LIST)
            sj.add(str);

        System.out.println(sj.toString());
    }
}
