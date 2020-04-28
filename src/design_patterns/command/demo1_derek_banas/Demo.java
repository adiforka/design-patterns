package design_patterns.command.demo1_derek_banas;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        Receiver tv1 = DeviceFactory.getDevice("tv");

        Command onCommand = new TurnTVOnCommand(tv1);
        Invoker onPressed = new Invoker(onCommand);
        onPressed.press();

        Command offCommand = new TurnTVOffCommand(tv1);
        Invoker offPressed = new Invoker(offCommand);
        offPressed.press();

        Command volUpCommand = new TurnTVUpCommand(tv1);
        Invoker volUpPressed = new Invoker(volUpCommand);
        volUpPressed.press();
        volUpPressed.press();
        volUpPressed.press();

        Command volDownCommand = new TurnTVDownCommand(tv1);
        Invoker volDownPressed = new Invoker(volDownCommand);
        volDownPressed.press();
        volDownPressed.press();
        volDownPressed.press();

        System.out.println("---------------------------");

        Receiver tv2 = DeviceFactory.getDevice("tv");
        Receiver radio1 = DeviceFactory.getDevice("radio");
        List<Receiver> devices = new ArrayList<>();
        devices.add(tv1);
        devices.add(tv2);
        devices.add(radio1);

        Command turnItAllOff = new TurnItAllOffCommand(devices);
        Invoker allOffPressed = new Invoker(turnItAllOff);

        System.out.println("Turning off all devices");
        allOffPressed.press();

        System.out.println("Undoing the turning off of all devices ");
        allOffPressed.pressUndo();
    }
}
