package controller;



import static data.StringList.STRING_LIST;

public class InsertCmd extends Command {
    private String element;
    private int index;

    public InsertCmd(String element, int index){
        this.element = element;
        this.index = index;
    }

    @Override
    public void execute() {
        STRING_LIST.add(this.index, this.element);
        System.out.println(String.join(" ", STRING_LIST));
    }
}
