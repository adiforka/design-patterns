package design_patterns.singleton_with_factory_manager_service;

//this may not be the classic singleton, since--because it implements the ManagerService interface--
//there may be more than one instance of the type in the JVM or, if handled by a framework container,
//in the Spring IOC. This step away from the classic implementation is supposedly what helps
//singleton not fall into the status of a global, and therefore, not dynamic and dynamically replaceable,
//component, and so saves it from charges of nullifying the possiblity of actually doing OOP with it.
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
