package design_patterns.singleton_with_factory_manager_service;

public class ManagerServiceFactory {

    //with strict type restriction (normally string used to denote type)
    public ManagerService getManagerService(ManagerServiceType serviceType) {
        if (serviceType.equals(ManagerServiceType.LOCAL)) {
            return ManagerServiceLocal.getInstance();
        } else return ManagerServiceRemote.getInstance();
    }
}
