package design_patterns.singleton.plain_singleton_demo;

public class PlainSingletonDemo {
    public static void main(String[] args) {

        PlainSingleton singleObject = PlainSingleton.getInstance();
        singleObject = PlainSingleton.getInstance();
        singleObject = PlainSingleton.getInstance();
        singleObject = PlainSingleton.getInstance();

        singleObject.doStuff();
    }
}
