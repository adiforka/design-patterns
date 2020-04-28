package design_patterns.command.demo2_okhravi;

public class LightReceiver {

    public void on() {
        System.out.println("Light on");
    }

    public void off() {
        System.out.println("Light off");
    }

    public void up() {
        System.out.println("Light brightness up");
    }

    public void down() {
        System.out.println("Light brightness down");
    }
}
