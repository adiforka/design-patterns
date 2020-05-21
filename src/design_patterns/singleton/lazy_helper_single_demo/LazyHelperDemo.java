package design_patterns.singleton.lazy_helper_single_demo;

public class LazyHelperDemo {
    public static void main(String[] args) {

        LazyHelper lazyHelper = LazyHelper.getInstance();
        lazyHelper.helpLazily();
    }
}
