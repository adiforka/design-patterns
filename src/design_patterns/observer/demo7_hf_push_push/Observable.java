package design_patterns.observer.demo7_hf_push_push;

public interface Observable {

    void addObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
