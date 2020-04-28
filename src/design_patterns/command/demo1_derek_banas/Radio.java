package design_patterns.command.demo1_derek_banas;

public class Radio implements Receiver {
    private int volume = 15;

    @Override
    public void on() {
        System.out.println("radio turned on");
    }

    @Override
    public void off() {
        System.out.println("radio turned off");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("radio volume at " + volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("radio volume at " + volume);
    }
}
