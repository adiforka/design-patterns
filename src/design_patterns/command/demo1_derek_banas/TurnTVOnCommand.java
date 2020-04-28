package design_patterns.command.demo1_derek_banas;

public class TurnTVOnCommand implements Command {

    private final Receiver device;

    public TurnTVOnCommand(Receiver device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }

    @Override
    public void undo() {
        device.off();
    }
}
