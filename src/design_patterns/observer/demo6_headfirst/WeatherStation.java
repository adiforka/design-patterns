package design_patterns.observer.demo6_headfirst;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {

    private double temperature;
    private final List<Observer> observers = new ArrayList<>();


    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    //is it a problem that notify is handled outside the station itself? (with update() in observer?)
    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

    //implementation-specific
    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    //implementation-specific
    public double getTemperature() {
        return temperature;
    }
}
