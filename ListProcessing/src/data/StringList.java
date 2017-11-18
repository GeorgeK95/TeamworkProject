package data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringList {

    public static List<String> STRING_LIST;

    public static void createAndPrintList(String string) {
        STRING_LIST = Arrays.stream(string.split("\\s+")).collect(Collectors.toList());
        System.out.println(String.join(" ", STRING_LIST));
    }

    /* Positions are indexed from 0 to list_size - 1. */
    public static boolean isValidIndex(int index) {
        return index >= 0 && index < STRING_LIST.size();
    }
}
