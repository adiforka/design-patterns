package design_patterns.singleton_with_factory_manager_service;

//this may not be the classic singleton, since--because it implements the ManagerService interface--
//there may be more than one instance of the type in the JVM or, if handled by a framework container,
//in the Spring IOC. This step away from the classic implementation is supposedly what helps
//singleton not fall into the status of a global, and therefore, not dynamic and dynamically replaceable,
//component, and so saves it from charges of nullifying the possiblity of actually doing OOP with it.
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
