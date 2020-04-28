package design_patterns.observer.demo7_hf_push_push;

public class DisplayA implements Observer, Display {

    //upside is no dependency on WeatherStation as a concretion
    //downside is I'm parameterizing interface methods for Double (maybe too specific),
    //or I have to use generics all around

    @Override
    public void update(double data) {
        System.out.println("Display A updated");
        display(data);
    }

    @Override
    public void display(double data) {
        System.out.println("A temperature: " + data + " °C");
    }

}
