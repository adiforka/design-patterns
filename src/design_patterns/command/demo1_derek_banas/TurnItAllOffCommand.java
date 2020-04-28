package design_patterns.command.demo1_derek_banas;

import java.util.List;

public class TurnItAllOffCommand implements Command {

    private final List<Receiver> allDevices;

    public TurnItAllOffCommand(List<Receiver> allDevices) {
        this.allDevices = allDevices;
    }

    @Override
    public void execute() {
        allDevices.forEach(Receiver::off);
    }

    @Override
    public void undo() {
        allDevices.forEach(Receiver::on);
    }
}
