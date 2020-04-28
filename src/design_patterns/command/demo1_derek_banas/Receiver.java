package design_patterns.command.demo1_derek_banas;

//receiver (maybe there should not be a receiver interface, but only concretions, since these can be anything
//that can be a receiver, and have any receiver methods)
public interface Receiver {

    void on();

    void off();

    void volumeUp();

    void volumeDown();
}
