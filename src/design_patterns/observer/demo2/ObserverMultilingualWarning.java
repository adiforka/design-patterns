package design_patterns.observer.demo2;

import java.util.ArrayList;
import java.util.List;

public class ObserverMultilingualWarning {
    public static void main(String[] args) {

        Observed observed = new Observed();

        new SpanishObserver(observed);
        new GermanObserver(observed);
        new EnglishObserver(observed);

        observed.setState(20);

        System.out.println();

        observed.setState(50);

    }
}

class Observed {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    private void notifyAllObservers() {
            for (Observer observer : observers)
                observer.update();
    }
}

interface Observer {
    void update();
}

class SpanishObserver implements Observer {

    private Observed observed;

    public SpanishObserver(Observed observed) {
        this.observed = observed;
        this.observed.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Bienvenidos! Los statos del objectos subjectos e " + observed.getState());
    }
}

class GermanObserver implements Observer {

    private Observed observed;

    public GermanObserver(Observed observed) {
        this.observed = observed;
        this.observed.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Wilkommen! Das schtadt der Objekt Subject ist " + observed.getState());
    }
}

class EnglishObserver implements Observer {

    private Observed observed;

    public EnglishObserver(Observed observed) {
        this.observed = observed;
        this.observed.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hello! The state of the subject object is " + observed.getState());
    }
}