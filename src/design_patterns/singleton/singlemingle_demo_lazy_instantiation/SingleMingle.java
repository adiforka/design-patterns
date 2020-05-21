package singlemingle_demo;

public class SingleMingle {

    private static SingleMingle instance;
    private static boolean instantiated;

    private SingleMingle() {
        System.out.println("constructor called, instance created");
    }

    public static SingleMingle getInstance() {
        if (!instantiated) {
            instance = new SingleMingle();
            instantiated = true;
        }

        return instance;
    }

    public void execute() {
        System.out.println("method called on instance. executing code");
    }

}
