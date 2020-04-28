package design_patterns.singleton;

public class LazyHelperTest {
    public static void main(String[] args) {

        LazyHelper lazyHelper = LazyHelper.getInstance();
        lazyHelper.helpLazily();
    }
}

/*i think the point of this being a singleton is that it's a helper class with a helper method and maybe there's different
* implementations of this and you want to use overriding so you still choose to have instance methods rather than a class method*/
class LazyHelper {

    private static LazyHelper lazyHelper;
    private static boolean instantiated;

    private LazyHelper() {}

    public static LazyHelper getInstance() {
        if (!instantiated) {
            lazyHelper = new LazyHelper();
            instantiated = true;
        }
        return lazyHelper;
    }

    public void helpLazily() {
        System.out.println("Helping lazily");
    }
}