package design_patterns.proxy.demo2_image_proxy;

public class ProxyImageDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image loaded from disk
        image.display();
        System.out.println();

        //image not loaded from disk--proxy object contains logic that verifies image has already
        //been loaded and does not to be loaded into the program again
        image.display();
    }
}
