package design_patterns.singleton_with_factory_manager_service;

public enum ManagerServiceType {

    LOCAL("local"), GLOBAL("global");

    private final String desc;

    private ManagerServiceType(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
