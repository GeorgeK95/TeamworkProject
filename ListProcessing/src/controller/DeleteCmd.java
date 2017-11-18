package controller;

import static data.StringList.STRING_LIST;

public class DeleteCmd extends Command {

    private int index;

    public DeleteCmd(int index) {
        this.index = index;
    }

    @Override
    public void execute() {
        STRING_LIST.remove(this.index);
        System.out.println(String.join(" ", STRING_LIST));
    }
}
