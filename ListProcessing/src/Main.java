import controller.*;
import data.StringList;
import exceptions.InvalidCommand;
import exceptions.InvalidIndex;
import exceptions.InvalidParameters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringList.createAndPrintList(reader.readLine());

        while (true) {

            String[] input = reader.readLine().split("\\s+");


            try {
                Command command;
                switch (input[0]) {

                    case "append":
                        if (input.length != 2)
                            throw new InvalidParameters();

                        command = new AppendCmd(input[1]);
                        break;

                    case "prepend":
                        if (input.length != 2)
                            throw new InvalidParameters();

                        command = new PrependCmd(input[1]);
                        break;

                    case "insert": {
                        if (input.length != 3)
                            throw new InvalidParameters();

                        int index = Integer.parseInt(input[1]);
                        String element = input[2];
                        if (!StringList.isValidIndex(index)) {
                            throw new InvalidIndex(index);
                        }
                        command = new InsertCmd(element, index);
                        }
                        break;

                    case "reverse":
                        if (input.length > 1) {
                            throw new InvalidParameters();
                        }
                        command = new ReverseCmd();
                        break;

                    case "delete":
                        if (input.length != 2)
                            throw new InvalidParameters();

                        try {
                            int index = Integer.parseInt(input[1]);
                            if (!StringList.isValidIndex(index)) {
                                throw new InvalidIndex(index);
                            }
                        }
                        catch (NumberFormatException nfe) {
                            throw new InvalidParameters();
                        }

                        command = new DeleteCmd(Integer.parseInt(input[1]));
                        break;

                    case "sort":
                        if (input.length != 1)
                            throw new InvalidParameters();

                        command = new SortCmd();
                        break;

                    case "count":
                        if (input.length != 2) {
                            throw new InvalidParameters();
                        }

                        command = new CountCmd(input[1]);
                        break;

                    case "roll":
                        if (input.length != 2 || !(("left".equals(input[1])) || "right".equals(input[1]))) {
                            throw new InvalidParameters();
                        }
                        command = new RollCmd(input[1]);
                        break;

                    case "end":
                        if (input.length > 1)
                            throw new InvalidParameters();

                        command = new EndCmd();
                        break;

                    default:
                        throw new InvalidCommand();
                }

                command.execute();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}