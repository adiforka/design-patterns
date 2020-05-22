package design_patterns.singleton.plain_singleton_demo;


//singletons are the typical choice for Spring business services.
//I guess because they typically don't carry data other than the dependency on another layer
//perhaps the repository/data layer, which is coded to the interface anyway, Spring can reuse the instance
//and inject different repo implementations to it
public class PlainSingleton {

    private static final PlainSingleton instance = new PlainSingleton();

    private PlainSingleton() {
        System.out.println("sole instance created");
    }

    public static PlainSingleton getInstance() {
        return instance;
    }

    public void doStuff() {
        System.out.println("Doing stuff");
    }

}
