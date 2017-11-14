package controller;

import java.util.Collections;

import static data.StringList.STRING_LIST;

public class ReverseCmd extends Command {

    @Override
    public void execute() {
        Collections.reverse(STRING_LIST);
        System.out.println(String.join(" ", STRING_LIST));
    }
}
