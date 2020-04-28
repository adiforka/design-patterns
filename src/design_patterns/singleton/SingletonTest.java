package design_patterns.singleton;

public class SingletonTest {
    public static void main(String[] args) {

        SingleObject singleObject = SingleObject.getInstance();
        singleObject.printHelloWorld();
    }
}

class SingleObject {

    private static SingleObject instance = new SingleObject();
    private String text;

    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void printHelloWorld() {
        System.out.println("Hello World");
    }
}
