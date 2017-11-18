package controller;

import static data.StringList.STRING_LIST;

public class CountCmd extends Command {
    private String str;

    public CountCmd(String str) {

        this.str = str;
    }

    @Override
    public void execute() {
        System.out.println((String.valueOf(STRING_LIST.stream().filter(x -> x.equals(str)).count())));
    }
}
