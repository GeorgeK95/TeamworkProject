package controller;

import static data.StringList.STRING_LIST;

public class SortCmd extends Command {

    @Override
    public void execute() {
        STRING_LIST.sort(String::compareTo);
        System.out.println((String.join(" ", STRING_LIST)));
    }
}
