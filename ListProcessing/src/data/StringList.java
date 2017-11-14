package data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringList {

    public static List<String> STRING_LIST;

    public static void createList(String string) {
        STRING_LIST = Arrays.stream(string.split("\\s+")).collect(Collectors.toList());
    }

    public static boolean isValidIndex(int index){
        return index > 0 && index < STRING_LIST.size();
    }
}
