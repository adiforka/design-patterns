package design_patterns.singleton_with_factory_manager_service;

public class ManagerServiceRemote implements ManagerService {
    private static ManagerServiceRemote managerServiceRemote;
    private static boolean instantiated;

    //making constructor calls from outside impossible (except with reflection or method handles)
    private ManagerServiceRemote() {
    }

    public static ManagerServiceRemote getInstance() {
        if (!instantiated) {
            managerServiceRemote = new ManagerServiceRemote();
            instantiated = true;
        }
        return managerServiceRemote;
    }

    @Override
    public String toString() {
        return "ManagerServiceRemote";
    }

    @Override
    public void perform() {
        System.out.println("Performing service remotely");
    }
}
