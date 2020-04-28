package design_patterns.observer.demo6_headfirst;

public class WindowDisplay implements Observer, Display {

    private final WeatherStation station;

    public WindowDisplay(WeatherStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        double tempUpdate = station.getTemperature();
        display(tempUpdate);
    }

    //the method to have the observer actually use the update info of the observable's state to do something
    @Override
    public void display(double tempUpdate) {
        System.out.println("Window display temperature: " + tempUpdate + " °C");
    }
}
