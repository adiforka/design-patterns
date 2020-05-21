package design_patterns.singleton.plain_singleton_demo;

public class PlainSingleton {

    private static final PlainSingleton instance = new PlainSingleton();

    private PlainSingleton() {
        System.out.println("sole instance created");
    }

    public static PlainSingleton getInstance() {
        return instance;
    }

}
