package design_patterns.command.demo2_okhravi;

public class Demo {

    public static int process(double input) {
        return (int) (input + 0.5);
    }
    public static void main(String[] args) {

        LightReceiver light = new LightReceiver();
        Invoker invoker = new Invoker(
                new LightOnCommand(light),
                new LightOffCommand(light),
                new LightUpCommand(light),
                new LightDownCommand(light)
        );

        invoker.pressOn();
        invoker.pressOff();
        invoker.pressUp();
        invoker.pressDown();
    }
}
