package design_patterns.observer.demo1;

import java.util.ArrayList;
import java.util.List;

/*when there is one-to-many relationship between objects such as if one object is modified,
its dependent objects are to be notified automatically.
Observer pattern falls under behavioral pattern category.*/
public class ObserverPatternNumbersTest {
    public static void main(String[] args) {

        Subject subject = new Subject();

        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change:  15");
        subject.setState(15);

        System.out.println();

        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}

class Subject {

    private final List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}

abstract class Observer {

    protected Subject subject;

    public abstract void update();

}

class BinaryObserver extends Observer {

    //interestingly, in this impl an observer is added to the list in subject (observable) at creation:)
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}

class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}

class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(
                subject.getState()).toUpperCase());
    }

}


