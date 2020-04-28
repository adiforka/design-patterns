package design_patterns.observer.demo5;

import java.util.ArrayList;
import java.util.List;

public class ObserverPatternTest5 {
    public static void main(String[] args) {

        var target = new Target();

        new OctalObserver(target);
        new HexObserver(target);
        new BinaryObserver(target);

        target.setState(25);
        target.setState(67);
    }
}

class Target {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {return state;}

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    void attach(Observer observer) {
        observers.add(observer);
    }

    void notifyAllObservers() {
        for (Observer observer : observers) observer.update();
    }
}

abstract class Observer {

    protected Target target;

    abstract void update();

}

class BinaryObserver extends Observer {

    public BinaryObserver(Target target) {
        this.target = target;
        target.attach(this);
    }

    @Override
    void update() {
        System.out.println("State of target changed to " + Integer.toBinaryString(target.getState()));
    }
}

class OctalObserver extends Observer {

    public OctalObserver(Target target) {
        this.target = target;
        target.attach(this);
    }

    @Override
    void update() {
        System.out.println("State of target changed to " + Integer.toOctalString(target.getState()));
    }
}

class HexObserver extends Observer {

    public HexObserver(Target target) {
        this.target = target;
        target.attach(this);
    }

    @Override
    void update() {
        System.out.println("State of target changed to " + Integer.toHexString(target.getState()));
    }
}

