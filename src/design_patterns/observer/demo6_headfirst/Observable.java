package design_patterns.observer.demo6_headfirst;

public interface Observable {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
