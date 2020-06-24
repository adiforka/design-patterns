package design_patterns.proxy.demo1_expensive_object_proxy;

public class DemoClient {
    public static void main(String[] args) {

        //the expensive object could be, for instance, a JDBC connection or a SessionFactory
        //want it to only be initialized on demand, and when initialized, to be reused for all calls

        //in the SF context, it is also supposed to isolate business logic from additional tasks, such
        //as transactions, logging, security
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
    }
}
