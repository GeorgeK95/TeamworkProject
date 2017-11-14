import controller.AppendCmd;
import controller.Command;
import controller.PrependCmd;
import data.StringList;
import exceptions.InvalidCommand;
import exceptions.InvalidParameters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringList.createList(reader.readLine());

        while (true) {

            String[] input = reader.readLine().split("\\s+");

            if ("end".equals(input[0])) {
                System.out.println("Finished");
                break;
            }

            try {
                Command command;
                switch (input[0]) {

                    case "append" :
                        if (input.length != 2)
                            throw new InvalidParameters();

                        command = new AppendCmd(input[1]);
                        break;

                    case "prepend":
                        if (input.length != 2)
                            throw new InvalidParameters();

                        command = new PrependCmd(input[1]);
                        break;

                    default:
                        throw new InvalidCommand();
                }

                if (command != null)
                    command.execute();
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}