package design_patterns.observer.demo6_headfirst;

public class PhoneDisplay implements Observer, Display {

    private final WeatherStation station;

    //coupling concretions breaks the dependency inversion principle! but it's part of this impl of
    //the OP, and thanks to that we can call the implementation-specific methods of the observable
    //(the subject) in the update() of observer (and not just some generic getState())
    public PhoneDisplay(WeatherStation station) {
        this.station = station;
    }

    //there is also a variant of OP where you don't pass the observable instance into the observer, for it to
    //pull the data changes from the observable (as below), but instead push the data out from the observable
    //to the observer as arguments to the update method (e.g., we could have double temperature as a parameter)
    @Override
    public void update() {
        double tempUpdate = station.getTemperature();
        display(tempUpdate);
    }

    //the method to have the observer actually use the update info of the observable's state to do something
    @Override
    public void display(double tempUpdate) {
        System.out.println("Phone display temperature: " + tempUpdate + " °C");
    }
}
