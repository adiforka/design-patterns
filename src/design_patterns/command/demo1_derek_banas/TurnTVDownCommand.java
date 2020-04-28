package design_patterns.command.demo1_derek_banas;

public class TurnTVDownCommand implements Command {

    Receiver device;

    public TurnTVDownCommand(Receiver device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeDown();
    }

    @Override
    public void undo() {
        device.volumeUp();
    }
}
