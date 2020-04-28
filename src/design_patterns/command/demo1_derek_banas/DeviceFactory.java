package design_patterns.command.demo1_derek_banas;

public class DeviceFactory {

    public static Receiver getDevice(String type) {

        if (type.equalsIgnoreCase("tv") || type.equalsIgnoreCase("television"))
            return new Television();
        else return new Radio();
    }
}
