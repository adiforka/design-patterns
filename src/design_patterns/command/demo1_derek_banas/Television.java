package design_patterns.command.demo1_derek_banas;

public class Television implements Receiver {

    private int volume = 15;

    @Override
    public void on() {
        System.out.println("television turned on");
    }

    @Override
    public void off() {
        System.out.println("television turned off");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("television volume at " + volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("television volume at " + volume);
    }
}
