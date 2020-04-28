package design_patterns.observer.demo7_hf_push_push;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {

    private double temperature;
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature);
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        //added additional condition to send notification only if the state actually changes
        if (temperature != this.temperature) {
            this.temperature = temperature;
            notifyObservers();
        }
    }
}
