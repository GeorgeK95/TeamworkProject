package controller;

/**
 * Created by George-Lenovo on 6/29/2017.
 */

import java.util.TreeSet;
import java.util.stream.Collectors;

import static data.StringList.STRING_LIST;

public class SortCmd extends Command {
    private TreeSet<String> set;

    public SortCmd() {
        this.set = new TreeSet<>(STRING_LIST);
    }

    @Override
    public void execute() {
        STRING_LIST = this.set.stream().collect(Collectors.toList());
        System.out.println((String.join(" ", STRING_LIST)));
    }
}
