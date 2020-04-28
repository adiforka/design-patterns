package design_patterns.observer.demo6;

import java.util.ArrayList;
import java.util.List;

public class GenderObserverPatternTest6 {
    public static void main(String[] args) {

        var subject = new Subject();

        new SpanishObserver(subject);
        new GermanObserver(subject);
        new EnglishObserver(subject);

        subject.setGender(Gender.MALE);

        System.out.println();

        subject.setGender(Gender.FEMALE);

    }
}

enum Gender {
    MALE, FEMALE
}

class Subject {

    private List<Observer> observers = new ArrayList<>();
    private Gender gender;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
        notifyAllObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) observer.update();
    }
}

abstract class Observer {

    protected Subject subject;

    abstract void update();
}

class SpanishObserver extends Observer {

    public SpanishObserver(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update() {
        if (subject.getGender().equals(Gender.MALE)) {
            System.out.println("El género del sujeto ha cambiado a masculino");
        }
        else System.out.println("El género del sujeto ha cambiado a hembra");
    }
}

class EnglishObserver extends Observer {

    public EnglishObserver(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update() {
        if (subject.getGender().equals(Gender.MALE)) {
            System.out.println("Subject's gender has changed to male");
        }
        else System.out.println("Subject's gender has changed to female");
    }
}

class GermanObserver extends Observer {

    public GermanObserver(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update() {
        if (subject.getGender().equals(Gender.MALE)) {
            System.out.println("Das Geschlecht des Probanden hat sich zu männlich geändert");
        }
        else System.out.println("Das Geschlecht des Probanden hat sich zu weiblich geändert");
    }
}
