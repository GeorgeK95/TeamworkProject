package controller;

import static data.StringList.STRING_LIST;

public class PrependCmd extends Command {
    private String stringToPrepend;

    public PrependCmd(String stringToPrepend){
        this.stringToPrepend = stringToPrepend;
    }

    @Override
    public void execute() {
        STRING_LIST.add(0, this.stringToPrepend);
        System.out.println(String.join(" ", STRING_LIST));
    }
}
