package design_patterns.command.demo1_derek_banas;

public class Invoker {

    private final Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    public void pressUndo() {
        command.undo();
    }

}
