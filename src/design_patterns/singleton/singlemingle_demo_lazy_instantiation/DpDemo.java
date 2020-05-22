package design_patterns.singleton.singlemingle_demo_lazy_instantiation;

public class DpDemo {
    public static void main(String[] args) {

        //first call produces an instance of SingleMingle
        SingleMingle instance = SingleMingle.getInstance();
        instance.execute();

        //subsequent calls return the same instance
        //(no printout for new instances created)
        //method is idempotent!
        instance = SingleMingle.getInstance();
        instance = SingleMingle.getInstance();
        instance = SingleMingle.getInstance();

        //just to make sure, compare reference identity for variables
        //i.e. check if they refer to the same object on the heap (returns true, so yes)
        SingleMingle instance2 = SingleMingle.getInstance();
        System.out.println(instance == instance2);
    }
}
