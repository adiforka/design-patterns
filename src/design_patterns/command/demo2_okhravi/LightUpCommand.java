package design_patterns.command.demo2_okhravi;

public class LightUpCommand implements Command {

    private final LightReceiver light;

    public LightUpCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.up();
    }

    @Override
    public void undo() {
        light.down();
    }
}
