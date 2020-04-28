package design_patterns.observer.demo6_headfirst;

import design_patterns.observer.demo7_hf_push_push.DisplayA;
import design_patterns.observer.demo7_hf_push_push.Observer;
import design_patterns.observer.demo7_hf_push_push.WeatherStation;

public class OPDemo {
    public static void main(String[] args) {

        design_patterns.observer.demo7_hf_push_push.WeatherStation station = new WeatherStation();

        design_patterns.observer.demo7_hf_push_push.Observer observer1 = new DisplayA();
        Observer observer2 = new DisplayB();

        station.addObserver(observer1);
        station.addObserver(observer2);

        station.setTemperature(12.2);
        station.setTemperature(15.4);
        station.setTemperature(15.8);
        station.setTemperature(15.8);
        station.setTemperature(15.8);
    }
}
