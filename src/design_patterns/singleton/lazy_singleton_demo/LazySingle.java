package design_patterns.singleton.lazy_singleton_demo;

public class LazySingle {


    private static LazySingle lazySingle;
    private static boolean instantiated = false;
    private String text;

    private LazySingle(String text) {
        this.text = text;
    }

    public static LazySingle getInstance() {
        if (!instantiated) {
            lazySingle = new LazySingle("Hello, gorgeous");
            instantiated = true;
        }
        return lazySingle;
    }

    public void print(String text) {
        System.out.println(text);
    }

    public String getText() {
        return text;
    }
}
