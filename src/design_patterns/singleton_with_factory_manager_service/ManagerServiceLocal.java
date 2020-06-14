package design_patterns.singleton_with_factory_manager_service;

public class ManagerServiceLocal implements ManagerService {
    private static ManagerServiceLocal managerServiceLocal;
    private static boolean instantiated = false;

    //making constructor calls from outside impossible (except with reflection or method handles)
    private ManagerServiceLocal() {
    }

    public static ManagerServiceLocal getInstance() {
        if (!instantiated) {
            managerServiceLocal = new ManagerServiceLocal();
            instantiated = true;
        }
        return managerServiceLocal;
    }

    @Override
    public String toString() {
        return "ManagerServiceLocal";
    }

    @Override
    public void perform() {
        System.out.println("Performing service locally");
    }
}
