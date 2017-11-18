package controller;

import static data.StringList.STRING_LIST;

public class RollCmd extends Command {

    private String position;

    public RollCmd(String position) {
        this.position = position;
    }

    @Override
    public void execute() {
        if ("left".equals(position)) {
            String firstElement = STRING_LIST.get(0);
            STRING_LIST.remove(0);
            STRING_LIST.add(firstElement);

            System.out.println(String.join(" ", STRING_LIST));
        } else if("right".equals(position)) {
            int size = STRING_LIST.size() - 1;

            String lastElement = STRING_LIST.get(size);
            STRING_LIST.remove(size);
            STRING_LIST.add(0, lastElement);

            System.out.println(String.join(" ", STRING_LIST));
        }
    }
}
