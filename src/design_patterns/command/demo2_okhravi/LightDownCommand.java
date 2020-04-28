package design_patterns.command.demo2_okhravi;

public class LightDownCommand implements Command {

    private final LightReceiver light;

    public LightDownCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.down();
    }

    @Override
    public void undo() {
        light.up();
    }
}
