package design_patterns.singleton.plain_singleton_demo;

public class PlainSingletonDemo {
    public static void main(String[] args) {

        SingleObject singleObject = SingleObject.getInstance();
        singleObject = SingleObject.getInstance();
        singleObject = SingleObject.getInstance();
        singleObject = SingleObject.getInstance();
    }
}
