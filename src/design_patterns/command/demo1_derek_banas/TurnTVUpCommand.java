package design_patterns.command.demo1_derek_banas;

public class TurnTVUpCommand implements Command {

    Receiver device;

    public TurnTVUpCommand(Receiver device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }

    @Override
    public void undo() {
        device.volumeDown();
    }
}
