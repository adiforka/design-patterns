package design_patterns.command.demo2_okhravi;

//specific to scenario. invokers do not need to have a common interface ancestor
//could be argued is not a strict element of the command pattern
public class Invoker {

    private final Command on;
    private final Command off;
    private final Command up;
    private final Command down;

    public Invoker(Command on, Command off, Command up, Command down) {
        this.on = on;
        this.off = off;
        this.up = up;
        this.down = down;
    }

    public void pressOn() {
        on.execute();
    }

    public void pressOff() {
        off.execute();
    }

    public void pressUp() {
        up.execute();
    }

    public void pressDown() {
        down.execute();
    }
}
