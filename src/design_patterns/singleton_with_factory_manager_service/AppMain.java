package design_patterns.singleton_with_factory_manager_service;

public class AppMain {
    public static void main(String[] args) {
        ManagerServiceFactory serviceFactory = new ManagerServiceFactory();

        ManagerService  managerService1 = serviceFactory.getManagerService(ManagerServiceType.GLOBAL);
        System.out.println(managerService1);

        ManagerService managerService2 = serviceFactory.getManagerService(ManagerServiceType.LOCAL);
        System.out.println(managerService2);
    }
}
