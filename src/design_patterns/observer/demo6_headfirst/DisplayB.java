package design_patterns.observer.demo6_headfirst;

import design_patterns.observer.demo7_hf_push_push.Display;
import design_patterns.observer.demo7_hf_push_push.Observer;

public class DisplayB implements Observer, Display {


    @Override
    public void update(double data) {
        System.out.println("Display B updated");
        display(data);
    }

    @Override
    public void display(double data) {
        System.out.println("B Temperature: " + data + " °C");
    }
}
