package design_patterns.singleton;

public class LazySingletonTest {
    public static void main(String[] args) {

        LazySingle lazySingle = LazySingle.getInstance();
        lazySingle.print(lazySingle.getText());

    }
}

class LazySingle {

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
