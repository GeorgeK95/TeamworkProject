package controller;

public class EndCmd extends Command {

    @Override
    public void execute() {

        System.out.println("Finished");
        System.exit(0);
    }
}
