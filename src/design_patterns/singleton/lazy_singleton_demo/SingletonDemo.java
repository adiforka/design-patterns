package design_patterns.singleton.lazy_singleton_demo;

public class SingletonDemo {
    public static void main(String[] args) {
        LazySingle lazySingle = LazySingle.getInstance();
        lazySingle.print(lazySingle.getText());
    }
}
