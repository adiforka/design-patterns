package design_patterns.command.demo1_derek_banas;

public class TurnTVOffCommand implements Command {

    private final Receiver device;

    public TurnTVOffCommand(Receiver device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }

    @Override
    public void undo() {
        device.on();
    }
}
